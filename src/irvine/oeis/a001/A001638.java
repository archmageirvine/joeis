package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001638 A Fielder sequence: a(n) = a(n-1) + a(n-3) + a(n-4), n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A001638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001638() {
    super(new long[] {1, 1, 0, 1}, new long[] {4, 1, 1, 4});
  }
}
