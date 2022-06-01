package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081068 a(n) = (Lucas(4*n+2) + 2)/5, or Fibonacci(2*n+1)^2, or A081067(n)/5.
 * @author Sean A. Irvine
 */
public class A081068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081068() {
    super(new long[] {1, -8, 8}, new long[] {1, 4, 25});
  }
}
