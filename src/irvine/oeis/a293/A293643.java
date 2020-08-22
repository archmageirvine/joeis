package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293643 a(n) is the least integer k such that k/Fibonacci(n) &gt; 3/5.
 * @author Sean A. Irvine
 */
public class A293643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293643() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 1, 1, 2, 2, 3, 5, 8, 13, 21, 33, 54, 87, 140, 227});
  }
}
