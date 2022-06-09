package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008530 Coordination sequence for 4-dimensional primitive di-isohexagonal orthogonal lattice.
 * @author Sean A. Irvine
 */
public class A008530 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008530() {
    super(
      new long[] {1, 8, 18, 8, 1},
      new int[] {1, 1, 1, 1});
  }
}

