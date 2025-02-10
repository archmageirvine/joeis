package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293543 a(n) = ceiling(Fibonacci(n)/3).
 * @author Sean A. Irvine
 */
public class A293543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293543() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 1, 1, 2, 3, 5, 7, 12});
  }
}
