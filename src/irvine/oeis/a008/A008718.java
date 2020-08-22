package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008718 Expansion of g.f.: (1+x^9)/((1-x)*(1-x^4)*(1-x^6)*(1-x^12)).
 * @author Sean A. Irvine
 */
public class A008718 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008718() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 4, 6, 12});
  }
}

