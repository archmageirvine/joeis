package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106517 Convolution of <code>Fib(n-1)</code> and <code>3^n</code>.
 * @author Sean A. Irvine
 */
public class A106517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106517() {
    super(new long[] {-3, -2, 4}, new long[] {1, 3, 10});
  }
}
