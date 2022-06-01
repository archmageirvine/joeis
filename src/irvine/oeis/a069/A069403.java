package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069403 a(n) = 2*Fibonacci(2*n+1) - 1.
 * @author Sean A. Irvine
 */
public class A069403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069403() {
    super(new long[] {1, -4, 4}, new long[] {1, 3, 9});
  }
}
