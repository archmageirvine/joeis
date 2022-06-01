package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293632 Least integer k such that k/Fibonacci(n) &gt;= 3/4.
 * @author Sean A. Irvine
 */
public class A293632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293632() {
    super(new long[] {-1, 0, 1, -1, 1, -1, 2}, new long[] {1, 1, 2, 3, 4, 6, 10});
  }
}
