package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008667 Generating function: 1/((1-x^2)(1-x^3)(1-x^4)(1-x^5)).
 * @author Sean A. Irvine
 */
public class A008667 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008667() {
    super(new long[] {1}, new int[] {2, 3, 4, 5});
  }
}

