package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077424 Chebyshev sequence <code>T(n,12)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077424() {
    super(new long[] {-1, 24}, new long[] {1, 12});
  }
}
