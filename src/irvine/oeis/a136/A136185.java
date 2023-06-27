package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136185 Number of metacyclic groups of order p^n, prime p &gt;= 3.
 * @author Sean A. Irvine
 */
public class A136185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136185() {
    super(1, new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {1, 2, 3, 5, 7, 11, 14, 20});
  }
}
