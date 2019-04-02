package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008807 Expansion of (1+x^5)/(1-x^2)^2/(1-x^5).
 * @author Sean A. Irvine
 */
public class A008807 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008807() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new int[] {2, 2, 5});
  }
}

