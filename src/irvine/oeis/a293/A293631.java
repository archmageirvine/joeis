package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293631 Greatest integer k such that k/Fibonacci(n) &lt;= 3/4.
 * @author Sean A. Irvine
 */
public class A293631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293631() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {0, 0, 1, 2, 3, 6, 9, 15});
  }
}
