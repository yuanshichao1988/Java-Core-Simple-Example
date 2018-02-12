package com.ysc.java.core.lang;

/**
 * Created by YSC
 * Date ： 2018/2/12 18:53
 * Description :
 * Since:1.0
 */
public class StringTest {

    public static void main(String[] args) {
        stringTest1();
    }

    static void stringTest1() {
        String a = "abc";
        String b = "a" + "b" + "c";
        System.out.println(a == b);

        String c = new String("abc");
        System.out.println(a == c);

        System.out.println(a.intern() == c.intern());
    }
}
