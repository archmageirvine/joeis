package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008401 Coordination sequence for {E_6}* lattice.
 * @author Sean A. Irvine
 */
public class A008401 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008401() {
    super(
      new long[] {1, 48, 519, 1024, 519, 48, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

