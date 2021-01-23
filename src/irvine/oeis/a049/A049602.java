package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049602 a(n) = (Fibonacci(2*n)-(-1)^n*Fibonacci(n))/2.
 * @author Sean A. Irvine
 */
public class A049602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049602() {
    super(new long[] {1, -4, 3, 2}, new long[] {0, 1, 1, 5});
  }
}
