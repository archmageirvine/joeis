package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081010 a(n) = Fibonacci(4n+1) + 2, or Fibonacci(2n-1)*Lucas(2n+2).
 * @author Sean A. Irvine
 */
public class A081010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081010() {
    super(new long[] {1, -8, 8}, new long[] {3, 7, 36});
  }
}
