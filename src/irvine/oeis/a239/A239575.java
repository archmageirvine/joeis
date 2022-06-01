package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239575 Number of non-equivalent (mod D_3) ways to place 5 indistinguishable points on a triangular grid of side n so that no two of them are adjacent.
 * @author Sean A. Irvine
 */
public class A239575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239575() {
    super(new long[] {1, -6, 10, 10, -50, 34, 66, -110, 0, 110, -66, -34, 50, -10, -10, 6}, new long[] {0, 0, 7, 176, 1976, 12565, 57275, 207018, 634166, 1711262, 4181915, 9428657, 19892816, 39684027, 75473209, 137721045});
  }
}
