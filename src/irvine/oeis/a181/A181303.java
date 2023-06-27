package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181303 Numbers of the form i*7^j-1 (i=1..6, j &gt;= 0).
 * @author Sean A. Irvine
 */
public class A181303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181303() {
    super(1, new long[] {-7, 7, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6});
  }
}
