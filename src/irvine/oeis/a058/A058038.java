package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058038 a(n) = Fibonacci(2*n)*Fibonacci(2*n+2).
 * @author Sean A. Irvine
 */
public class A058038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058038() {
    super(new long[] {1, -8, 8}, new long[] {0, 3, 24});
  }
}
