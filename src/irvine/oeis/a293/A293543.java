package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293543 a(n) is the least integer k such that k/Fibonacci(n) &gt; 1/3.
 * @author Sean A. Irvine
 */
public class A293543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293543() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 1, 1, 2, 3, 5, 7, 12});
  }
}
