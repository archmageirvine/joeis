package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008752 Expansion of (1+x^9)/((1-x)*(1-x^2)*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A008752 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008752() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

