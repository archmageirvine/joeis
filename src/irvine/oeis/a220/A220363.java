package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220363 <code>a(n) = Fibonacci(n)^3 + (-1)^n*Fibonacci(n+2)</code>.
 * @author Sean A. Irvine
 */
public class A220363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220363() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, -1, 4, 3});
  }
}
