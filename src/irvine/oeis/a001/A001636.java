package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001636 A Fielder sequence: a(n) = a(n-1) + a(n-2) - a(n-7), n &gt;= 8.
 * @author Sean A. Irvine
 */
public class A001636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001636() {
    super(1, new long[] {1, 1, 1, 1, 1, 0}, new long[] {0, 2, 3, 6, 10, 17});
  }
}
