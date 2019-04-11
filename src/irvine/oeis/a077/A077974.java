package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077974 Expansion of <code>1/(1+x+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077974() {
    super(new long[] {-2, 0, -1}, new long[] {1, -1, 1});
  }
}
