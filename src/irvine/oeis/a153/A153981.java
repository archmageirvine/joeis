package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153981 a(n) = 36*Fibonacci(2*n+1) - 4.
 * @author Sean A. Irvine
 */
public class A153981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153981() {
    super(new long[] {1, -4, 4}, new long[] {32, 68, 176});
  }
}
