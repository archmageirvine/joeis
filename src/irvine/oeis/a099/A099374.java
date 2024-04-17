package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099374 a(n) = A041041(n-1)^2, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A099374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099374() {
    super(new long[] {-1, 101, 101}, new long[] {0, 1, 100});
  }
}
