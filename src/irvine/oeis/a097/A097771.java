package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097771 Chebyshev U(n,x) polynomial evaluated at x=339=2*13^2+1.
 * @author Sean A. Irvine
 */
public class A097771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097771() {
    super(new long[] {-1, 678}, new long[] {1, 678});
  }
}
