package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129728 a(n) = 2*(n-1) + Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A129728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129728() {
    super(1, new long[] {1, -1, -2, 3}, new long[] {1, 3, 6, 9});
  }
}
