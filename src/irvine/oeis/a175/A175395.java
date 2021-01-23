package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175395 a(n) = 2*Fibonacci(n)^2.
 * @author Sean A. Irvine
 */
public class A175395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175395() {
    super(new long[] {-1, 2, 2}, new long[] {0, 2, 2});
  }
}
