package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008763 Expansion of g.f.: x^4/((1-x)*(1-x^2)^2*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A008763 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008763() {
    super(new long[] {0, 0, 0, 0, 1}, new int[] {1, 2, 2, 3});
  }
}

