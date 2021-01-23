package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097740 Chebyshev U(n,x) polynomial evaluated at x=201.
 * @author Sean A. Irvine
 */
public class A097740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097740() {
    super(new long[] {-1, 402}, new long[] {1, 402});
  }
}
