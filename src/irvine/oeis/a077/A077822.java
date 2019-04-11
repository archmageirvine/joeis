package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077822 Expansion of <code>(1-x)^(-1)/(1-3*x-3*x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077822() {
    super(new long[] {-2, -1, 0, 4}, new long[] {1, 4, 16, 63});
  }
}
