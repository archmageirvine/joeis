package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293644 <code>a(n)</code> is the integer k that minimizes |k/Fibonacci(n) - 3/5|.
 * @author Sean A. Irvine
 */
public class A293644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293644() {
    super(new long[] {1, 1, -2, -1, 2, 1, -2, -1, 2, 1}, new long[] {0, 1, 1, 1, 2, 3, 5, 8, 13, 20});
  }
}
