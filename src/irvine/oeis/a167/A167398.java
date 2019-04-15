package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167398 <code>a(n) = Fibonacci(11*n)</code>.
 * @author Sean A. Irvine
 */
public class A167398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167398() {
    super(new long[] {1, 199}, new long[] {0, 89});
  }
}
