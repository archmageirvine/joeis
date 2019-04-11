package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077259 First member of the Diophantine pair (m,k) that satisfies 5*(m^2 + m) = k^2 + k; <code>a(n) =</code> m.
 * @author Sean A. Irvine
 */
public class A077259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077259() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {0, 2, 6, 44, 116});
  }
}
