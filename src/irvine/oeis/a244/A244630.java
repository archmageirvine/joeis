package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244630 a(n) = 17*n^2.
 * @author Sean A. Irvine
 */
public class A244630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244630() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 68});
  }
}
