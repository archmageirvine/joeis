package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101399 a(0) = 1, a(1) = 2, a(2) = 5; for n &gt;= 3, a(n) = a(n-1) + 2*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A101399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101399() {
    super(new long[] {1, 2, 1}, new long[] {1, 2, 5});
  }
}
