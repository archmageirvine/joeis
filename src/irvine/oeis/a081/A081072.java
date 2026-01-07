package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081072 a(n) = Fibonacci(4*n) + 3, or Fibonacci(2*n+2)*Lucas(2*n-2).
 * @author Sean A. Irvine
 */
public class A081072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081072() {
    super(new long[] {1, -8, 8}, new long[] {3, 6, 24});
  }
}
