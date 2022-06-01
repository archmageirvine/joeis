package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180673 a(n) = Fibonacci(n+8) - Fibonacci(8).
 * @author Sean A. Irvine
 */
public class A180673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180673() {
    super(new long[] {-1, 0, 2}, new long[] {0, 13, 34});
  }
}
