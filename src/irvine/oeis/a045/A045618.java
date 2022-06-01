package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045618 Partial sums of A000337(n+4), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A045618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045618() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 6, 23, 72});
  }
}
