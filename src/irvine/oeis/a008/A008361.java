package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008361 Coordination sequence for <code>D_8</code> lattice.
 * @author Sean A. Irvine
 */
public class A008361 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008361() {
    super(
      new long[] {1, 104, 1724, 7768, 12550, 7768, 1724, 104, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
