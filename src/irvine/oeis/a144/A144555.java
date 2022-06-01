package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144555 a(n) = 14*n^2.
 * @author Sean A. Irvine
 */
public class A144555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144555() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 56});
  }
}
