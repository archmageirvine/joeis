package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093042 Jacobsthal(n)*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A093042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093042() {
    super(new long[] {-4, 2, 7, 1}, new long[] {0, 1, 1, 6});
  }
}
