package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144391 a(n) = 3*n^2 + n - 1.
 * @author Sean A. Irvine
 */
public class A144391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144391() {
    super(1, new long[] {1, -3, 3}, new long[] {3, 13, 29});
  }
}
