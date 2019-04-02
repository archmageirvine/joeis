package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008385 Coordination sequence for A_5 lattice.
 * @author Sean A. Irvine
 */
public class A008385 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008385() {
    super(
      new long[] {1, 25, 100, 100, 25, 1},
      new int[] {1, 1, 1, 1, 1});
  }
}

