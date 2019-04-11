package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033891 <code>a(n) =</code> Fibonacci(4*n+3).
 * @author Sean A. Irvine
 */
public class A033891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033891() {
    super(new long[] {-1, 7}, new long[] {2, 13});
  }
}
