package irvine.oeis.a201;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A201632 If the sum of the squares of 4 consecutive numbers is a triangular number t(u), then a(n) is its index u.
 * @author Sean A. Irvine
 */
public class A201632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201632() {
    super(1, new long[] {1, -1, -34, 34, 1}, new long[] {35, 83, 1203, 2835, 40883});
  }
}
