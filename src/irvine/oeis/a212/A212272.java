package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212272 <code>a(n) = Fibonacci(n) + n^3</code>.
 * @author Sean A. Irvine
 */
public class A212272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212272() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 2, 9, 29, 67, 130});
  }
}
