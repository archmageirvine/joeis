package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008760 Expansion of (1+x^17)/(1-x)/(1-x^2)/(1-x^3).
 * @author Sean A. Irvine
 */
public class A008760 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008760() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

