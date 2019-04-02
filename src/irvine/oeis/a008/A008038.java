package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008038 Coordination sequence T1 for Zeolite Code ATS.
 * @author Sean A. Irvine
 */
public class A008038 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008038() {
    super(
      new long[] {1, 4, 10, 19, 30, 44, 58, 69, 76, 75, 68, 58, 42, 23, 10, 2, -5, -6, -2},
      new int[] {5, 5, 6});
  }
}

