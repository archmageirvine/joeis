package irvine.oeis.a031;

import irvine.oeis.LinearRecurrence;

/**
 * A031923 Let r and s be consecutive Fibonacci numbers. Sequence is r^4, r^3 s, r^2 s^2, and r s^3.
 * @author Sean A. Irvine
 */
public class A031923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031923() {
    super(new long[] {-1, -1, 1, 0, -2, -2, 2, 0, 2, 2, -2, 0, 1, 1}, new long[] {1, 2, 4, 8, 16, 24, 36, 54, 81, 135, 225, 375, 625, 1000});
  }
}
