package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190062 a(n) = n*Fibonacci(n) - Sum_{i=0..n-1} Fibonacci(i).
 * @author Sean A. Irvine
 */
public class A190062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190062() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {0, 1, 1, 4, 8});
  }
}
