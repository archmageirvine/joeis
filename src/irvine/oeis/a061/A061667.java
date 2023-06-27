package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061667 a(n) = Fibonacci(2*n+1) - 2^(n-1).
 * @author Sean A. Irvine
 */
public class A061667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061667() {
    super(1, new long[] {2, -7, 5}, new long[] {1, 3, 9});
  }
}
