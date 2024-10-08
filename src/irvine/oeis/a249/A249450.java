package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249450 a(n) = Fibonacci(2*n) - 2.
 * @author Sean A. Irvine
 */
public class A249450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249450() {
    super(new long[] {1, -4, 4}, new long[] {-2, -1, 1});
  }
}
