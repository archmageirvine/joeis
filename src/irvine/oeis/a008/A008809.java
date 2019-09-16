package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008809 Expansion of <code>(1+x^9)/((1-x^2)^2*(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A008809 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008809() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 9});
  }
}

