package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180674 a(n) = Fibonacci(n+9) - Fibonacci(9).
 * @author Sean A. Irvine
 */
public class A180674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180674() {
    super(new long[] {-1, 0, 2}, new long[] {0, 21, 55});
  }
}
