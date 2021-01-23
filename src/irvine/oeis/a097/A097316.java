package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097316 Chebyshev U(n,x) polynomial evaluated at x=33.
 * @author Sean A. Irvine
 */
public class A097316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097316() {
    super(new long[] {-1, 66}, new long[] {1, 66});
  }
}
