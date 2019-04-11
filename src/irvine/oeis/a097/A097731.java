package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097731 Chebyshev U(n,x) polynomial evaluated at <code>x=99 = 2*7^2+1</code>.
 * @author Sean A. Irvine
 */
public class A097731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097731() {
    super(new long[] {-1, 198}, new long[] {1, 198});
  }
}
