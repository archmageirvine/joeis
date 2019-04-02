package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128534 a(n) = Fibonacci(n)*Lucas(n-1).
 * @author Sean A. Irvine
 */
public class A128534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128534() {
    super(new long[] {-1, 2, 2}, new long[] {0, 2, 1});
  }
}
