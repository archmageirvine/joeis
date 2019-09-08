package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077903 Expansion of <code>(1-x)^(-1)/(1 + x - x^2 + 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077903() {
    super(new long[] {2, -3, 2, 0}, new long[] {1, 0, 2, -3});
  }
}
