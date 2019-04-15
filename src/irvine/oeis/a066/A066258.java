package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066258 <code>a(n) = Fibonacci(n)^2 * Fibonacci(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A066258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066258() {
    super(new long[] {-1, -3, 6, 3}, new long[] {0, 1, 2, 12});
  }
}
