package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008387 Coordination sequence for <code>A_6</code> lattice.
 * @author Sean A. Irvine
 */
public class A008387 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008387() {
    super(
      new long[] {1, 36, 225, 400, 225, 36, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

