package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174141 Numbers congruent to k mod 25, where 0 &lt;= k &lt;= 9.
 * @author Sean A. Irvine
 */
public class A174141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174141() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 25});
  }
}
