package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276658 Tribonacci-like sequence <code>a(n) = a(n-1) + a(n-2) + a(n-3)</code> for <code>n &gt;= 3,</code> with <code>a(0) = 1, a(1) = 2, a(2) = 0</code>.
 * @author Sean A. Irvine
 */
public class A276658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276658() {
    super(new long[] {1, 1, 1}, new long[] {1, 2, 0});
  }
}
