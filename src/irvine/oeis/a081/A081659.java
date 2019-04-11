package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081659 <code>a(n) = n +</code> Fibonacci(n+1).
 * @author Sean A. Irvine
 */
public class A081659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081659() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 4, 6});
  }
}
