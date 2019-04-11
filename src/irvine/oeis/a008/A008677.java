package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008677 Expansion of <code>1/((1-x^3)*(1-x^5)*(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A008677 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008677() {
    super(new long[] {1}, new int[] {3, 5, 7});
  }
}

