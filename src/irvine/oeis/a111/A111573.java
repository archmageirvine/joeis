package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111573 a(n) = a(n-1) + a(n-3) + a(n-4), n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A111573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111573() {
    super(new long[] {1, 1, 0, 1}, new long[] {0, 1, 3, 3});
  }
}
