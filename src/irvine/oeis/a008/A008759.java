package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008759 Expansion of (1+x^16)/(1-x)/(1-x^2)/(1-x^3).
 * @author Sean A. Irvine
 */
public class A008759 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008759() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

