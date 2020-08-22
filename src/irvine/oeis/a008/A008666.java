package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008666 Expansion of g.f.: 1/((1-x^2)*(1-x^3)*(1-x^5)*(1-x^6)*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A008666 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008666() {
    super(new long[] {1}, new int[] {2, 3, 5, 6, 9});
  }
}

