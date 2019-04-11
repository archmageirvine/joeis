package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077938 Expansion of <code>1/(1-2*x-x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077938() {
    super(new long[] {2, 1, 2}, new long[] {1, 2, 5});
  }
}
