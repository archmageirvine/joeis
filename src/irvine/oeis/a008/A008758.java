package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008758 Expansion of <code>(1+x^15)/(1-x)/(1-x^2)/(1-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A008758 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008758() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

