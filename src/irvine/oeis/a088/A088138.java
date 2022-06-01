package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088138 Generalized Gaussian Fibonacci integers.
 * @author Sean A. Irvine
 */
public class A088138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088138() {
    super(new long[] {-4, 2}, new long[] {0, 1});
  }
}
