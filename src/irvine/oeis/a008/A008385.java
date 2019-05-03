package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008385 Coordination sequence for <code>A_5</code> lattice.
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

