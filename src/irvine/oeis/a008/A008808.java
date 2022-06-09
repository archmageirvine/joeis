package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008808 Expansion of (1+x^7)/((1-x^2)^2*(1-x^7)).
 * @author Sean A. Irvine
 */
public class A008808 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008808() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 7});
  }
}

