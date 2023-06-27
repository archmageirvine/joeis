package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290651 a(n) = 5 - 2^(n - 1) + 3^(n - 1) + n - 2.
 * @author Sean A. Irvine
 */
public class A290651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290651() {
    super(1, new long[] {-6, 17, -17, 7}, new long[] {4, 6, 11, 26});
  }
}
