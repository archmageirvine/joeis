package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008250 Coordination sequence T2 for Banalsite.
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

