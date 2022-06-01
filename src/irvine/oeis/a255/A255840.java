package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255840 a(n) = (4*n^2 - 4*n + 1 - (-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A255840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255840() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 4, 13});
  }
}
