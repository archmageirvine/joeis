package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293639 a(n) is the greatest integer k such that k/Fibonacci(n) &lt; 2/5.
 * @author Sean A. Irvine
 */
public class A293639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293639() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 0, 0, 0, 1, 2, 3, 5, 8, 13, 22, 35, 57, 93, 150});
  }
}
