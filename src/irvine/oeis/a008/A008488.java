package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008488 Expansion of <code>(1-x^6) / (1-x)^6</code>.
 * @author Sean A. Irvine
 */
public class A008488 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008488() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1});
  }
}

