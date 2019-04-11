package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008492 Expansion of <code>(1-x^10 ) / (1-x)^10</code>.
 * @author Sean A. Irvine
 */
public class A008492 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008492() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

