package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008531 Coordination sequence for {A_4}* lattice.
 * @author Sean A. Irvine
 */
public class A008531 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008531() {
    super(
      new long[] {1, 6, 16, 6, 1},
      new int[] {1, 1, 1, 1});
  }
}

