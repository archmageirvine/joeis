package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008820 Expansion of <code>(1+2*x^7+x^12)/(1-x^2)^2/(1-x^12)</code>.
 * @author Sean A. Irvine
 */
public class A008820 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008820() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1}, new int[] {2, 2, 12});
  }
}

