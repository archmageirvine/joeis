package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232568 Number of non-equivalent binary <code>n X n</code> matrices with three pairwise nonadjacent <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A232568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232568() {
    super(new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 6, 40, 210, 681, 1919, 4443, 9481, 18206, 33164, 56570});
  }
}
