package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045925 a(n) = n*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A045925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045925() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 2, 6});
  }
}
