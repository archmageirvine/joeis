package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008340 Coordination sequence for E_8 lattice.
 * @author Sean A. Irvine
 */
public class A008340 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008340() {
    super(
      new long[] {1, 232, 7228, 55384, 133510, 107224, 24508, 232, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
