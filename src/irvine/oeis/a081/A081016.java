package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081016 <code>a(n) =</code> (Lucas(4*n+3)+1)/5, or Fibonacci(2*n+1)*Fibonacci(2*n+2), or A081015(n)/5.
 * @author Sean A. Irvine
 */
public class A081016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081016() {
    super(new long[] {1, -8, 8}, new long[] {1, 6, 40});
  }
}
