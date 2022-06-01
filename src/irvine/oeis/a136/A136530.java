package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136530 a(n) = 2^n*(3*n^2 + 13*n + 8)/8.
 * @author Sean A. Irvine
 */
public class A136530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136530() {
    super(new long[] {8, -12, 6}, new long[] {1, 6, 23});
  }
}
