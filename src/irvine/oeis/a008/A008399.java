package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008399 Coordination sequence for <code>E_6</code> lattice.
 * @author Sean A. Irvine
 */
public class A008399 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008399() {
    super(
      new long[] {1, 66, 645, 1384, 645, 66, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

