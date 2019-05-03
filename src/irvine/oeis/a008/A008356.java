package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008356 Crystal ball sequence for <code>D_5</code> lattice.
 * @author Sean A. Irvine
 */
public class A008356 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008356() {
    super(
      new long[] {1, 35, 180, 180, 35, 1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}
