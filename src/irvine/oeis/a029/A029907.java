package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029907 a(n+1) = a(n) + a(n-1) + Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A029907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029907() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 2, 4});
  }
}
