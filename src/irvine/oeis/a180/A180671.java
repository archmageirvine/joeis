package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180671 <code>a(n) =</code> Fibonacci(n+6) - Fibonacci(6).
 * @author Sean A. Irvine
 */
public class A180671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180671() {
    super(new long[] {-1, 0, 2}, new long[] {0, 5, 13});
  }
}
