package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008398 Crystal ball sequence for E_7 lattice.
 * @author Sean A. Irvine
 */
public class A008398 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008398() {
    super(
      new long[] {1, 119, 2037, 8211, 8787, 2037, 119, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

