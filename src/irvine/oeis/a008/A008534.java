package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008534 Coordination sequence for {A_6}* lattice.
 * @author Sean A. Irvine
 */
public class A008534 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008534() {
    super(
      new long[] {1, 8, 29, 64, 29, 8, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

