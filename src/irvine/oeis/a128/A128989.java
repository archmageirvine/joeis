package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128989 a(n) = (n^3 - n^2)*6^n.
 * @author Sean A. Irvine
 */
public class A128989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128989() {
    super(1, new long[] {-1296, 864, -216, 24}, new long[] {0, 144, 3888, 62208});
  }
}
