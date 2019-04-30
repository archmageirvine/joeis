package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077423 Chebyshev sequence <code>U(n,12)=S(n,24)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077423() {
    super(new long[] {-1, 24}, new long[] {1, 24});
  }
}
