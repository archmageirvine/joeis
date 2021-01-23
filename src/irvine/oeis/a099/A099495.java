package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099495 A Chebyshev transform of Fib(n)^2.
 * @author Sean A. Irvine
 */
public class A099495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099495() {
    super(new long[] {-1, 2, -1, 3, -1, 2}, new long[] {0, 1, 1, 2, 6, 12});
  }
}
