package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175864 Partial sums of <code>ceiling(n^2/19)</code>.
 * @author Sean A. Irvine
 */
public class A175864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175864() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4, 6, 8, 11, 15, 20, 26, 33, 41, 50, 61, 73, 87, 103, 121, 140, 162, 186});
  }
}
