package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008384 Crystal ball sequence for A_4 lattice.
 * @author Sean A. Irvine
 */
public class A008384 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008384() {
    super(
      new long[] {1, 16, 36, 16, 1},
      new int[] {1, 1, 1, 1, 1});
  }
}

