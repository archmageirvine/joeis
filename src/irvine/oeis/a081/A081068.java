package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081068 <code>a(n) =</code> (Lucas(4*n+2) <code>+ 2)/5,</code> or Fibonacci(2*n+1)^2, or A081067(n)/5.
 * @author Sean A. Irvine
 */
public class A081068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081068() {
    super(new long[] {1, -8, 8}, new long[] {1, 4, 25});
  }
}
