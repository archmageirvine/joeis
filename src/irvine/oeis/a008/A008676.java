package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008676 Expansion of 1/((1-x^3)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A008676 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008676() {
    super(new long[] {1}, new int[] {3, 5});
  }
}

