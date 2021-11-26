package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027941 a(n) = Fibonacci(2*n + 1) - 1.
 * @author Sean A. Irvine
 */
public class A027941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027941() {
    super(new long[] {1, -4, 4}, new long[] {0, 1, 4});
  }
}
