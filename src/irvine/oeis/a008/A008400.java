package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008400 Crystal ball sequence for E_6 lattice.
 * @author Sean A. Irvine
 */
public class A008400 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008400() {
    super(
      new long[] {1, 66, 645, 1384, 645, 66, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

