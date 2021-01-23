package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008045 Coordination sequence T1 for Zeolite Code AWW.
 * @author Sean A. Irvine
 */
public class A008045 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008045() {
    super(
      new long[] {1, 3, 6, 10, 13, 17, 22, 25, 27, 27, 25, 22, 17, 13, 10, 6, 3, 1},
      new int[] {1, 7, 9});
  }
}

