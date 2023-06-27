package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239570 Number of ways to place 4 points on a triangular grid of side n so that no two of them are adjacent.
 * @author Sean A. Irvine
 */
public class A239570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239570() {
    super(3, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 114, 1137, 6100, 23265, 71211, 186739, 436437});
  }
}
