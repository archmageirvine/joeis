package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060161 a(n) = 2^n - 1 + 2*Fibonacci(n-1).
 * @author Sean A. Irvine
 */
public class A060161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060161() {
    super(1, new long[] {2, -1, -4, 4}, new long[] {1, 5, 9, 19});
  }
}
