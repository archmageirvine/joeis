package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113450 Difference between the square root of n-th square triangular number and n-th lambda number given by the recurrence f(n) = 2f(n-1) + f(n-2), f(1) = 1, f(2)= 2.
 * @author Sean A. Irvine
 */
public class A113450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113450() {
    super(new long[] {1, -4, -12, 8}, new long[] {0, 4, 30, 192});
  }
}
