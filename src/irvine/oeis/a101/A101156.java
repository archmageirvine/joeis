package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101156 a(n) = 2*Fibonacci(n) + 8*Fibonacci(n-5).
 * @author Sean A. Irvine
 */
public class A101156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101156() {
    super(new long[] {1, 1}, new long[] {10, 24});
  }
}
