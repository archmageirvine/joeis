package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008249 Coordination sequence T1 for Banalsite.
 * @author Sean A. Irvine
 */
public class A008249 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008249() {
    super(
      new long[] {1, 3, 7, 10, 16, 15, 12, 6, 1, -1, -1, -1},
      new int[] {1, 3, 4});
  }
}

