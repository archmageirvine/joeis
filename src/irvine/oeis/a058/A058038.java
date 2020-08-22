package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058038 Fibonacci(2n)*Fibonacci(2n+2).
 * @author Sean A. Irvine
 */
public class A058038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058038() {
    super(new long[] {1, -8, 8}, new long[] {0, 3, 24});
  }
}
