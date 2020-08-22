package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015583 a(0) = 0, a(1) = 1; for n &gt;= 2, a(n) = 9*a(n-1) + 7*a(n-2).
 * @author Sean A. Irvine
 */
public class A015583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015583() {
    super(new long[] {7, 9}, new long[] {0, 1});
  }
}
