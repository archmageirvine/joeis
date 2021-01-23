package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077422 Chebyshev sequence T(n,11) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077422() {
    super(new long[] {-1, 22}, new long[] {1, 11});
  }
}
