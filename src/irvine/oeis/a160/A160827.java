package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160827 a(n) = 3*n^4 + 12*n^3 + 30*n^2 + 36*n + 17.
 * @author Sean A. Irvine
 */
public class A160827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160827() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {17, 98, 353, 962, 2177});
  }
}
