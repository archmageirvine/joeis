package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008402 Crystal ball sequence for <code>{E_6}*</code> lattice.
 * @author Sean A. Irvine
 */
public class A008402 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008402() {
    super(
      new long[] {1, 48, 519, 1024, 519, 48, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

