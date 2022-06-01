package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269500 a(n) = Fibonacci(10*n).
 * @author Sean A. Irvine
 */
public class A269500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269500() {
    super(new long[] {-1, 123}, new long[] {0, 55});
  }
}
