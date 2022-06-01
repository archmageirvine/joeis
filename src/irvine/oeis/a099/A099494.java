package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099494 A Chebyshev transform of Fib(n)+(-1)^n.
 * @author Sean A. Irvine
 */
public class A099494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099494() {
    super(new long[] {-1, 0, -1, 1, -1, 0}, new long[] {1, 0, 1, 1, -1, 0});
  }
}
