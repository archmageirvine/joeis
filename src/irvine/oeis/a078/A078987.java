package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078987 Chebyshev U(n,x) polynomial evaluated at x=19.
 * @author Sean A. Irvine
 */
public class A078987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078987() {
    super(new long[] {-1, 38}, new long[] {1, 38});
  }
}
