package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099367 a(n) = A054413(n-1), n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A099367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099367() {
    super(new long[] {-1, 50, 50}, new long[] {0, 1, 49});
  }
}
