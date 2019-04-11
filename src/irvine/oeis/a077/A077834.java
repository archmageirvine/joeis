package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077834 Expansion of <code>1/(1 - 2*x - 2*x^2 - 3*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077834() {
    super(new long[] {3, 2, 2}, new long[] {1, 2, 6});
  }
}
