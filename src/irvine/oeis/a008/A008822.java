package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008822 Expansion of <code>(1 + 2*x^2 + x^3)/((1 - x)^2*(1 - x^3))</code>.
 * @author Sean A. Irvine
 */
public class A008822 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008822() {
    super(new long[] {1, 0, 2, 1}, new int[] {1, 1, 3});
  }
}

