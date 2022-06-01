package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024219 a(n) = floor( (2nd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ), where S(n) = {first n+1 positive integers congruent to 1 mod 3}.
 * @author Sean A. Irvine
 */
public class A024219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024219() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 3, 7, 12, 19});
  }
}
