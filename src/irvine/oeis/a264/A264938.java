package irvine.oeis.a264;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A264938 a(n) = n*(2*n-1) + floor(n/3).
 * @author Sean A. Irvine
 */
public class A264938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264938() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 6, 16, 29});
  }
}
