package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178312 n * T(ceiling(n/2)), where T are the triangular numbers, A000217.
 * @author Sean A. Irvine
 */
public class A178312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178312() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 2, 9, 12, 30, 36});
  }
}
