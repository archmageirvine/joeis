package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097768 Chebyshev U(n,x) polynomial evaluated at x=289=2*12^2+1.
 * @author Sean A. Irvine
 */
public class A097768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097768() {
    super(new long[] {-1, 578}, new long[] {1, 578});
  }
}
