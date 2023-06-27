package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268201 a(n) = 4*n^3 - 6*n^2 + 3*n - 1.
 * @author Sean A. Irvine
 */
public class A268201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268201() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {0, 13, 62, 171});
  }
}
