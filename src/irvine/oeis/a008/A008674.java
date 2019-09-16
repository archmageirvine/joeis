package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008674 Expansion of <code>1/((1-x)*(1-x^3)*(1-x^5)*(1-x^7)*(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A008674 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008674() {
    super(new long[] {1}, new int[] {1, 3, 5, 7, 9});
  }
}

