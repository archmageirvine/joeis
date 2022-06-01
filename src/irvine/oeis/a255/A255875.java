package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255875 a(n) = Fibonacci(n+2) + n - 2.
 * @author Sean A. Irvine
 */
public class A255875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255875() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 6, 10});
  }
}
