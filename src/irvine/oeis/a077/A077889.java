package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077889 Expansion of <code>(1-x)^(-1)/(1 + x^2 + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077889() {
    super(new long[] {1, 0, -1, 1}, new long[] {1, 1, 0, -1});
  }
}
