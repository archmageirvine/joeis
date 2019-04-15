package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228078 <code>a(n) = 2^n - Fibonacci(n) - 1</code>.
 * @author Sean A. Irvine
 */
public class A228078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228078() {
    super(new long[] {2, -1, -4, 4}, new long[] {0, 0, 2, 5});
  }
}
