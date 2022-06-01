package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022272 a(n) = n*(15*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022272() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 29});
  }
}
