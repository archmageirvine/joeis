package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008750 Expansion of <code>(1+x^7)/(1-x)/(1-x^2)/(1-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A008750 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008750() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new int[] {1, 2, 3});
  }
}

