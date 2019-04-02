package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008673 Expansion of 1/((1-x)*(1-x^3)*(1-x^5)*(1-x^7)).
 * @author Sean A. Irvine
 */
public class A008673 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008673() {
    super(new long[] {1}, new int[] {1, 3, 5, 7});
  }
}

