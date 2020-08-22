package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008819 Expansion of (1+2*x^5+x^8)/((1-x^2)^2*(1-x^8)).
 * @author Sean A. Irvine
 */
public class A008819 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008819() {
    super(new long[] {1, 0, 0, 0, 0, 2, 0, 0, 1}, new int[] {2, 2, 8});
  }
}

