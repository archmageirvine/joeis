package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008816 Expansion of (1+x^9)/((1-x)^2*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A008816 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008816() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 1, 9});
  }
}

