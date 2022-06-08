package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008812 Expansion of (1+x^5)/((1-x)^2*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A008812 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008812() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new int[] {1, 1, 5});
  }
}

