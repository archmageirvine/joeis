package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062392 a(n) = n^4 - (n-1)^4 + (n-2)^4 - ... 0^4.
 * @author Sean A. Irvine
 */
public class A062392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062392() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 15, 66, 190});
  }
}
