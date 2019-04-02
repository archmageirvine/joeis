package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008681 Expansion of 1/((1-x^3 )(1-x^4 )(1-x^5 )(1-x^6)).
 * @author Sean A. Irvine
 */
public class A008681 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008681() {
    super(new long[] {1}, new int[] {3, 4, 5, 6});
  }
}

