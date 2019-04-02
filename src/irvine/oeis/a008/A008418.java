package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008418 Coordination sequence for 9-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A008418 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008418() {
    super(
      new long[] {1, 9, 36, 84, 126, 126, 84, 36, 9, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

