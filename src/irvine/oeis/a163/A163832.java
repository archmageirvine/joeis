package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163832 a(n) = n*(2*n^2 + 5*n + 1).
 * @author Sean A. Irvine
 */
public class A163832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163832() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 38, 102});
  }
}
