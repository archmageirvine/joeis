package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081013 a(n) = Fibonacci(4*n+3) - 2, or Fibonacci(2*n)*Lucas(2*n+3).
 * @author Sean A. Irvine
 */
public class A081013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081013() {
    super(new long[] {1, -8, 8}, new long[] {0, 11, 87});
  }
}
