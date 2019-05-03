package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008250 Coordination sequence <code>T2</code> for Banalsite.
 * @author Sean A. Irvine
 */
public class A008250 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008250() {
    super(
      new long[] {1, 3, 7, 12, 14, 13, 12, 8, 3, -3, -1, -1},
      new int[] {1, 3, 4});
  }
}

