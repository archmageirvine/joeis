package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136392 a(n) = 6*n^2 - 10*n + 5.
 * @author Sean A. Irvine
 */
public class A136392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136392() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 29});
  }
}
