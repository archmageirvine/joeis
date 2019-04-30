package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251780 Digital root of A069778(n-1) <code>= n^3 - n^2 + 1, n &gt;= 1. Repeat(1, 6, 3, 7, 6, 6, 4, 6, 9)</code>.
 * @author Sean A. Irvine
 */
public class A251780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251780() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 3, 7, 6, 6, 4, 6, 9});
  }
}
