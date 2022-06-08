package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008527 Coordination sequence for body-centered tetragonal lattice.
 * @author Sean A. Irvine
 */
public class A008527 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008527() {
    super(
      new long[] {1, 7, 7, 1},
      new int[] {1, 1, 1});
  }
}

