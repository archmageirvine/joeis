package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077845 Expansion of <code>(1-x)^(-1)/(1-2*x-2*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077845() {
    super(new long[] {-1, -1, 0, 3}, new long[] {1, 3, 9, 26});
  }
}
