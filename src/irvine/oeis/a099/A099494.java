package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099494 A Chebyshev transform of <code>Fib(n)+(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A099494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099494() {
    super(new long[] {-1, 0, -1, 1, -1, 0}, new long[] {1, 0, 1, 1, -1, 0});
  }
}
