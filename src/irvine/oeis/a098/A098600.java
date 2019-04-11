package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098600 <code>a(n) =</code> Fibonacci(n-1) + Fibonacci(n+1) <code>- (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A098600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098600() {
    super(new long[] {1, 2, 0}, new long[] {1, 2, 2});
  }
}
