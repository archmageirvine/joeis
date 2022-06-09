package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008806 Expansion of (1+x^3)/((1-x^2)^2*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A008806 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008806() {
    super(new long[] {1, 0, 0, 1}, new int[] {2, 2, 3});
  }
}

