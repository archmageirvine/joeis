package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062025 a(n) = n*(13*n^2 - 7)/6.
 * @author Sean A. Irvine
 */
public class A062025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062025() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 15, 55});
  }
}
