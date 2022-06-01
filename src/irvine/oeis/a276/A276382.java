package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276382 a(1) = 1, and a(n) = a(n-1) + floor(3*n/2) + 1 for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A276382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276382() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 5, 10, 17});
  }
}
