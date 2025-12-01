package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092387 a(n) = Fibonacci(2*n+1) + Fibonacci(2*n-1) + 2.
 * @author Sean A. Irvine
 */
public class A092387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092387() {
    super(0, new long[] {1, -4, 4}, new long[] {4, 5, 9});
  }
}
