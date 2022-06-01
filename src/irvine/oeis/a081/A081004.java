package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081004 a(n) = Fibonacci(4n+2) + 1, or Fibonacci(2n+2)*Lucas(2n).
 * @author Sean A. Irvine
 */
public class A081004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081004() {
    super(new long[] {1, -8, 8}, new long[] {2, 9, 56});
  }
}
