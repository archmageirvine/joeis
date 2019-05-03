package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136185 Number of metacyclic groups of order <code>p^n</code>, prime p <code>&gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A136185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136185() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {1, 2, 3, 5, 7, 11, 14, 20});
  }
}
