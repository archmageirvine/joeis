package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221920 a(n) = 3*n/gcd(3*n, n+3), n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A221920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221920() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 12, 15, 2, 21, 24, 9, 30, 33, 12, 39, 42, 5, 48, 51, 18, 57, 60});
  }
}
