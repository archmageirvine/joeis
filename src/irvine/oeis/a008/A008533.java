package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008533 Coordination sequence for <code>{A_5}*</code> lattice.
 * @author Sean A. Irvine
 */
public class A008533 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008533() {
    super(
      new long[] {1, 7, 22, 22, 7, 1},
      new int[] {1, 1, 1, 1, 1});
  }
}

