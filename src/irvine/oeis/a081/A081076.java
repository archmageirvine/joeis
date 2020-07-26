package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081076 <code>a(n) = Lucas(4n) + 3</code>, or <code>5*Fibonacci(2n-1)*Fibonacci(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A081076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081076() {
    super(new long[] {1, -8, 8}, new long[] {5, 10, 50});
  }
}
