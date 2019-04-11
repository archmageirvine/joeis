package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008821 Expansion of <code>(1+2*x^9+x^16)/(1-x^2)^2/(1-x^16)</code>.
 * @author Sean A. Irvine
 */
public class A008821 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008821() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 16});
  }
}

