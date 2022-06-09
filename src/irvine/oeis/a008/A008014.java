package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008014 Coordination sequence T1 for Zeolite Code AFI.
 * @author Sean A. Irvine
 */
public class A008014 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008014() {
    super(
      new long[] {1, 2, 4, 3, 4, 4, 6, 4, 4, 3, 4, 2, 1},
      new int[] {1, 1, 10});
  }
}

