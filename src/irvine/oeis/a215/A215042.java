package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215042 a(n) = F(8*n)/L(2*n) with n &gt;= 0, F = A000045 (Fibonacci numbers) and L = A000032 (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A215042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215042() {
    super(new long[] {-1, 21, -56, 21}, new long[] {0, 7, 141, 2576});
  }
}
