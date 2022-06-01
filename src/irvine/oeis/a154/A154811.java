package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154811 a(n) = Fibonacci(2n+1) mod 9.
 * @author Sean A. Irvine
 */
public class A154811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154811() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 2, 5, 4, 7, 8, 8});
  }
}
