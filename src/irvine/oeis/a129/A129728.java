package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129728 <code>a(n) = 2*n-2 + Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A129728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129728() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 6, 9});
  }
}
