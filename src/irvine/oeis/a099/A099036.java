package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099036 a(n) = 2^n - Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A099036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099036() {
    super(new long[] {-2, -1, 3}, new long[] {1, 1, 3});
  }
}
