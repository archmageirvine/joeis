package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081076 a(n) = Lucas(4n) + 3, or 5*Fibonacci(2n-1)*Fibonacci(2n+1).
 * @author Sean A. Irvine
 */
public class A081076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081076() {
    super(new long[] {1, -8, 8}, new long[] {5, 10, 50});
  }
}
