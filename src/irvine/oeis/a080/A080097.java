package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080097 a(n) = Fibonacci(n+2)^2 - 1.
 * @author Sean A. Irvine
 */
public class A080097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080097() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 3, 8, 24});
  }
}
