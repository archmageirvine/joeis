package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293672 a(n) is the least integer k such that k/Fibonacci(n) &gt; 4/5.
 * @author Sean A. Irvine
 */
public class A293672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293672() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 1, 1, 2, 3, 4, 7, 11, 17, 28, 44, 72, 116, 187, 302});
  }
}
