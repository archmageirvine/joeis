package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008093 Coordination sequence T1 for Zeolite Code ERI and OFF.
 * @author Sean A. Irvine
 */
public class A008093 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008093() {
    super(
      new long[] {1, 4, 9, 17, 30, 49, 70, 84, 88, 88, 88, 84, 70, 49, 30, 17, 9, 4, 1},
      new int[] {5, 6, 7});
  }
}
