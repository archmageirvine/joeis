package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008823 Expansion of (1+2*x^3+x^5)/((1-x)^2*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A008823 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008823() {
    super(new long[] {1, 0, 0, 2, 0, 1}, new int[] {1, 1, 5});
  }
}

