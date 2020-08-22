package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287277 Number of set partitions of [n] such that for each block all absolute differences between consecutive elements are &lt;= five.
 * @author Sean A. Irvine
 */
public class A287277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287277() {
    super(new long[] {-1, 0, 2, 0, 13, -4, -30, 6, -16, 16, 54, -28, -3, -4, -6, 6}, new long[] {1, 1, 2, 5, 15, 52, 203, 825, 3442, 14589, 62361, 267663, 1151563, 4960725, 21384434, 92216247});
  }
}
