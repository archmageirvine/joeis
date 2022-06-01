package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211547 The squares n^2, n &gt;= 0, each one written three times.
 * @author Sean A. Irvine
 */
public class A211547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211547() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 4});
  }
}
