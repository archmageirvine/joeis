package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008419 Crystal ball sequence for 9-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008419 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008419() {
    super(
      new long[] {1, 9, 36, 84, 126, 126, 84, 36, 9, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

