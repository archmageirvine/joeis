package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023607 <code>n * Fibonacci(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A023607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023607() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 4, 9});
  }
}
