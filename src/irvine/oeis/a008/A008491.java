package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008491 Expansion of <code>(1-x^9 ) / (1-x)^9</code>.
 * @author Sean A. Irvine
 */
public class A008491 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008491() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

