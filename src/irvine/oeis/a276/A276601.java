package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276601 Values of k such that k^2 + 9 is a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A276601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276601() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 6, 12, 37});
  }
}
