package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160805 a(n) = (2*n^3 + 9*n^2 + n + 24) / 6.
 * @author Sean A. Irvine
 */
public class A160805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160805() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 6, 13, 27});
  }
}
