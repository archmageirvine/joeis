package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060160 a(n) = 2^n - 1 + Fibonacci(n-1)*2^(n+1).
 * @author Sean A. Irvine
 */
public class A060160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060160() {
    super(new long[] {8, -8, -4, 5}, new long[] {1, 11, 23, 79});
  }
}
