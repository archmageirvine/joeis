package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008762 Expansion of <code>(1+x)/((1-x)*(1-x^2)*(1-x^3)*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A008762 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008762() {
    super(new long[] {1, 1}, new int[] {1, 2, 3, 4});
  }
}

