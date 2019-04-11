package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061667 <code>a(n) =</code> Fibonacci(2*n+1) <code>- 2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A061667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061667() {
    super(new long[] {2, -7, 5}, new long[] {1, 3, 9});
  }
}
