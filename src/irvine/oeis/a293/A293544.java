package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293544 a(n) is the integer k that minimizes | k/Fibonacci(n) - 1/3 |.
 * @author Sean A. Irvine
 */
public class A293544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293544() {
    super(new long[] {1, 1, -1, 0, 1, 1}, new long[] {0, 0, 0, 1, 1, 2});
  }
}
