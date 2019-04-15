package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060160 <code>a(n) = 2^n - 1 + Fibonacci(n-1)*2^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A060160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060160() {
    super(new long[] {8, -8, -4, 5}, new long[] {1, 11, 23, 79});
  }
}
