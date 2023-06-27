package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001639 A Fielder sequence. a(n) = a(n-1) + a(n-3) + a(n-4) + a(n-5), n &gt;= 6.
 * @author Sean A. Irvine
 */
public class A001639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001639() {
    super(1, new long[] {1, 1, 1, 0, 1}, new long[] {1, 1, 4, 9, 16});
  }
}
