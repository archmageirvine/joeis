package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029907 a(n+1) = a(n) + a(n-1) + Fibonacci(n), with a(0) = 0 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A029907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029907() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 2, 4});
  }
}
