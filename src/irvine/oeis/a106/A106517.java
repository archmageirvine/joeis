package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106517 Convolution of Fibonacci(n-1) and 3^n.
 * @author Sean A. Irvine
 */
public class A106517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106517() {
    super(new long[] {-3, -2, 4}, new long[] {1, 3, 10});
  }
}
