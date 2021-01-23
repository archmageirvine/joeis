package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081017 a(n) = Lucas(4n+1) - 1, or 5*Fibonacci(2n)*Fibonacci(2n+1).
 * @author Sean A. Irvine
 */
public class A081017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081017() {
    super(new long[] {1, -8, 8}, new long[] {0, 10, 75});
  }
}
