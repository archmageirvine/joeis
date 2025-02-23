package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073880 a(1) = 1, a(n) = smallest palindrome not included earlier such that a(1)+...+a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A073880 extends FiniteSequence {

  /** Construct the sequence. */
  public A073880() {
    super(1, FINITE, 1, 2, 3, 5, 11, 22, 33, 44, 101, 111, 121, 131, 202, 212, 222, 1001, 1111, 1221, 1331, 2002, 2112, 2222, 10001, 10101, 10201, 10301, 11011, 11111, 12021, 13031, 22222, 100001, 101101, 102201, 103301, 110011, 111111, 120021, 130031, 20202, 1000001, 1001001, 1002001, 1003001, 1010101, 1011101, 1012101, 1020201, 2042402, 10000001, 10011001, 10022001, 10033001, 10100101, 10111101, 10200201, 10300301);
  }
}
