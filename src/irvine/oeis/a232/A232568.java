package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232568 Number of non-equivalent binary n X n matrices with three pairwise nonadjacent 1's.
 * @author Sean A. Irvine
 */
public class A232568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232568() {
    super(2, new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 6, 40, 210, 681, 1919, 4443, 9481, 18206, 33164, 56570});
  }
}
