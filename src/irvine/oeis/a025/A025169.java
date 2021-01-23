package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025169 a(n) = 2*Fibonacci(2*n+2).
 * @author Sean A. Irvine
 */
public class A025169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025169() {
    super(new long[] {-1, 3}, new long[] {2, 6});
  }
}
