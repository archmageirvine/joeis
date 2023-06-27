package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157476 a(n) = 2048n^2 + 128n + 1.
 * @author Sean A. Irvine
 */
public class A157476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157476() {
    super(1, new long[] {1, -3, 3}, new long[] {2177, 8449, 18817});
  }
}
