package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293671 a(n) is the greatest integer k such that k/Fibonacci(n) &lt; 4/5.
 * @author Sean A. Irvine
 */
public class A293671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293671() {
    super(new long[] {-1, -1, 2, 1, -2, 0, 3, -1, -3, 1, 2, -2, -1, 2, 1}, new long[] {0, 0, 0, 1, 2, 4, 6, 10, 16, 27, 44, 71, 115, 186, 301});
  }
}
