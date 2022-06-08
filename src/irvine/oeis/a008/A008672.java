package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008672 Expansion of 1/((1-x)*(1-x^3)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A008672 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008672() {
    super(new long[] {1}, new int[] {1, 3, 5});
  }
}

