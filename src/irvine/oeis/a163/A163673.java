package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163673 a(n) = n*(2*n^2 + 5*n + 15)/2.
 * @author Sean A. Irvine
 */
public class A163673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163673() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 11, 33, 72});
  }
}
