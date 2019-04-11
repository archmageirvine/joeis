package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007805 <code>a(n) =</code> Fibonacci(6*n+3)/2.
 * @author Sean A. Irvine
 */
public class A007805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007805() {
    super(new long[] {-1, 18}, new long[] {1, 17});
  }
}

