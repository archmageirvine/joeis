package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107253 a(n) = n^4 - 15*n + 15.
 * @author Sean A. Irvine
 */
public class A107253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107253() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 51, 211, 565});
  }
}
