package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077836 Expansion of <code>(1-x)/(1-3*x-3*x^2-3*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077836() {
    super(new long[] {3, 3, 3}, new long[] {1, 2, 9});
  }
}
