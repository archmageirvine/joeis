package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293553 <code>a(n)</code> is the integer k that minimizes <code>|k/Fibonacci(n) - 1/4|</code>.
 * @author Sean A. Irvine
 */
public class A293553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293553() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {0, 0, 0, 0, 1, 1, 2, 3});
  }
}
