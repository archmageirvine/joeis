package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008804 Expansion of 1/((1-x)^2*(1-x^2)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A008804 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008804() {
    super(new long[] {1}, new int[] {1, 1, 2, 4});
  }
}

