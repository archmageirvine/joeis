package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226315 a(n) = (n^2/8+3*n/8-2)*2^n + 3.
 * @author Sean A. Irvine
 */
public class A226315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226315() {
    super(1, new long[] {-8, 20, -18, 7}, new long[] {0, 0, 5, 27});
  }
}
