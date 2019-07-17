package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081010 <code>a(n) = Fibonacci(4n+1) + 2</code>, or <code>Fibonacci(2n-1)*Lucas(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081010() {
    super(new long[] {1, -8, 8}, new long[] {3, 7, 36});
  }
}
