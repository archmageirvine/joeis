package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093043 Jacobsthal(n)*Fibonacci(n-1).
 * @author Sean A. Irvine
 */
public class A093043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093043() {
    super(new long[] {-4, 2, 7, 1}, new long[] {0, 0, 1, 3});
  }
}
