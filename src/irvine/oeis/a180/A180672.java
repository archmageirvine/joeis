package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180672 a(n) = Fibonacci(n+7) - Fibonacci(7).
 * @author Sean A. Irvine
 */
public class A180672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180672() {
    super(new long[] {-1, 0, 2}, new long[] {0, 8, 21});
  }
}
