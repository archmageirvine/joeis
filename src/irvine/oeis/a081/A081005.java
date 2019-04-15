package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081005 <code>Fibonacci(4n+3)+1,</code> or <code>Fibonacci(2n+1)*Lucas(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081005() {
    super(new long[] {1, -8, 8}, new long[] {3, 14, 90});
  }
}
