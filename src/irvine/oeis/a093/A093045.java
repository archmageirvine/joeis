package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093045 2*Jacobsthal(n-1)*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A093045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093045() {
    super(new long[] {-4, 2, 7, 1}, new long[] {0, 0, 2, 4});
  }
}
