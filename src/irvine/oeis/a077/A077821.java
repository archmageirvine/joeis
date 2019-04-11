package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077821 Expansion of <code>(1-x)^(-1)/(1-3*x-3*x^2-3*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077821() {
    super(new long[] {-3, 0, 0, 4}, new long[] {1, 4, 16, 64});
  }
}
