package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062159 a(n) = n^5 - n^4 + n^3 - n^2 + n - 1.
 * @author Sean A. Irvine
 */
public class A062159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062159() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1, 0, 21, 182, 819, 2604});
  }
}
