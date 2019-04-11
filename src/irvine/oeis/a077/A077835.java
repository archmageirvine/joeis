package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077835 Expansion of <code>1/(1-2*x-2*x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077835() {
    super(new long[] {2, 2, 2}, new long[] {1, 2, 6});
  }
}
