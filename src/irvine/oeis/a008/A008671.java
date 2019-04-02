package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008671 Expansion of 1/((1-x^2)(1-x^3)(1-x^7)).
 * @author Sean A. Irvine
 */
public class A008671 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008671() {
    super(new long[] {1}, new int[] {2, 3, 7});
  }
}

