package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062989 a(n) = C(n+6, 6) - n - 1.
 * @author Sean A. Irvine
 */
public class A062989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062989() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 5, 25, 80, 205, 456, 917});
  }
}
