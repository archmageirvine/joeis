package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181288 Numbers of the form i*6^j-1 (i=1..5, j &gt;= 0).
 * @author Sean A. Irvine
 */
public class A181288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181288() {
    super(1, new long[] {-6, 6, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5});
  }
}
