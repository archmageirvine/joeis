package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153981 <code>a(n) = 36*Fibonacci(2*n+1) - 4</code>.
 * @author Sean A. Irvine
 */
public class A153981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153981() {
    super(new long[] {1, -4, 4}, new long[] {32, 68, 176});
  }
}
