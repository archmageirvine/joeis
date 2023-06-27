package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157728 a(n) = Fibonacci(n) - 4.
 * @author Sean A. Irvine
 */
public class A157728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157728() {
    super(5, new long[] {-1, 0, 2}, new long[] {1, 4, 9});
  }
}
