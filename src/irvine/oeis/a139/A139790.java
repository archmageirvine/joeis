package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139790 a(n) = (5*2^(n+2) - 3*n*2^n - 2*(-1)^n) / 18.
 * @author Sean A. Irvine
 */
public class A139790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139790() {
    super(new long[] {-4, 0, 3}, new long[] {1, 2, 3});
  }
}
