package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008040 Coordination sequence T3 for Zeolite Code ATS.
 * @author Sean A. Irvine
 */
public class A008040 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008040() {
    super(
      new long[] {1, 4, 10, 19, 32, 49, 63, 72, 76, 72, 63, 49, 32, 19, 10, 4, 1},
      new int[] {5, 5, 6});
  }
}

