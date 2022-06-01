package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023607 a(n) = n * Fibonacci(n+1).
 * @author Sean A. Irvine
 */
public class A023607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023607() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 4, 9});
  }
}
