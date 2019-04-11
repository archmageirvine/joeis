package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008487 Expansion of <code>(1-x^5) / (1-x)^5</code>.
 * @author Sean A. Irvine
 */
public class A008487 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008487() {
    super(
      new long[] {1, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1});
  }
}

