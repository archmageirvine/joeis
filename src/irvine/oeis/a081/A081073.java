package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081073 <code>Fibonacci(4n+2)+3,</code> or <code>Fibonacci(2n-1)*Lucas(2n+3)</code>.
 * @author Sean A. Irvine
 */
public class A081073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081073() {
    super(new long[] {1, -8, 8}, new long[] {4, 11, 58});
  }
}
