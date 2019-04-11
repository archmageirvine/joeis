package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144391 <code>a(n) = 3*n^2 + n - 1</code>.
 * @author Sean A. Irvine
 */
public class A144391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144391() {
    super(new long[] {1, -3, 3}, new long[] {3, 13, 29});
  }
}
