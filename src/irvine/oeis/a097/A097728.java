package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097728 Chebyshev U(n,x) polynomial evaluated at x=73 = 2*6^2+1.
 * @author Sean A. Irvine
 */
public class A097728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097728() {
    super(new long[] {-1, 146}, new long[] {1, 146});
  }
}
