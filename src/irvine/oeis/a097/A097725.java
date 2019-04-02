package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097725 Chebyshev U(n,x) polynomial evaluated at x=51.
 * @author Sean A. Irvine
 */
public class A097725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097725() {
    super(new long[] {-1, 102}, new long[] {1, 102});
  }
}
