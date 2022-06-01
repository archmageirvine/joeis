package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097734 Chebyshev U(n,x) polynomial evaluated at x=129 = 3*43.
 * @author Sean A. Irvine
 */
public class A097734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097734() {
    super(new long[] {-1, 258}, new long[] {1, 258});
  }
}
