package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008533 Coordination sequence for {A_5}* lattice.
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

