package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193575 T(n)^3 - n^3 where T(n) is a triangular number.
 * @author Sean A. Irvine
 */
public class A193575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193575() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 19, 189, 936, 3250, 9045, 21609});
  }
}
