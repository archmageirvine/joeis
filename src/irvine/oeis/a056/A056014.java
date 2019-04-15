package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056014 <code>a(n) = (Fibonacci(2n-1) - Fibonacci(n+1))/2</code>.
 * @author Sean A. Irvine
 */
public class A056014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056014() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 0, 1});
  }
}
