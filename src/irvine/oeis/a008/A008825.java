package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008825 Expansion of (1+2*x^5+x^9)/((1-x)^2*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A008825 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008825() {
    super(new long[] {1, 0, 0, 0, 0, 2, 0, 0, 0, 1}, new int[] {1, 1, 9});
  }
}

