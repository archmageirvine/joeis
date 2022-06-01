package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081074 Fibonacci(4n)-3, or Fibonacci(2n-2)*Lucas(2n+2).
 * @author Sean A. Irvine
 */
public class A081074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081074() {
    super(new long[] {1, -8, 8}, new long[] {0, 18, 141});
  }
}
