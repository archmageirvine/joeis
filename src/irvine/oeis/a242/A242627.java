package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242627 Number of divisors of n that are less than 10.
 * @author Sean A. Irvine
 */
public class A242627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242627() {
    super(new long[] {1, 2, 4, 7, 11, 15, 20, 24, 27, 28, 27, 23, 17, 9, 0, -9, -17, -23, -27, -28, -27, -24, -20, -15, -11, -7, -4, -2}, new long[] {9, 1, 2, 2, 3, 2, 4, 2, 4, 3, 3, 1, 5, 1, 3, 3, 4, 1, 5, 1, 4, 3, 2, 1, 6, 2, 2, 3});
  }
}
