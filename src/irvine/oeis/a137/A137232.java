package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137232 a(n) = -a(n-1) + 7*a(n-2) + 3*a(n-3) with a(0) = a(1) = 0, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A137232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137232() {
    super(new long[] {3, 7, -1}, new long[] {0, 0, 1});
  }
}
