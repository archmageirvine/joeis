package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008719 Expansion of 1/((1-x)*(1-x^4)*(1-x^6)*(1-x^12)).
 * @author Sean A. Irvine
 */
public class A008719 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008719() {
    super(new long[] {1}, new int[] {1, 4, 6, 12});
  }
}

