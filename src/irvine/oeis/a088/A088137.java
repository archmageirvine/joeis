package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088137 Generalized Gaussian Fibonacci integers.
 * @author Sean A. Irvine
 */
public class A088137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088137() {
    super(new long[] {-3, 2}, new long[] {0, 1});
  }
}
