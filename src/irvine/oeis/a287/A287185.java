package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287185 a(n) = 3*a(n-2) + a(n-3) + a(n-5) - 3*a(n-6) - a(n-7), where a(0) = 2, a(1) = 4, a(2) = 7, a(3) = 14, a(4) = 25, a(5) = 47, a(6) = 88, a(7) = 166.
 * @author Sean A. Irvine
 */
public class A287185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287185() {
    super(new long[] {-1, -3, 0, 1, 0, 1, 3, 0}, new long[] {2, 4, 7, 14, 25, 47, 88, 166});
  }
}
