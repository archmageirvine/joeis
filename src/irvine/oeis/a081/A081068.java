package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081068 <code>a(n) = (Lucas(4*n+2) + 2)/5</code>, or <code>Fibonacci(2*n+1)^2</code>, or <code>A081067(n)/5</code>.
 * @author Sean A. Irvine
 */
public class A081068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081068() {
    super(new long[] {1, -8, 8}, new long[] {1, 4, 25});
  }
}
