package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077956 Expansion of <code>1/(1-x+2*x^2+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077956() {
    super(new long[] {-2, -2, 1}, new long[] {1, 1, -1});
  }
}
