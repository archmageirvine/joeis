package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008415 Coordination sequence for 7-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008415 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008415() {
    super(
      new long[] {1, 7, 21, 35, 35, 21, 7, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

