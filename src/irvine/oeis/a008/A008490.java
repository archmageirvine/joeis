package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008490 Expansion of <code>(1-x^8) / (1-x)^8</code>.
 * @author Sean A. Irvine
 */
public class A008490 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008490() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

