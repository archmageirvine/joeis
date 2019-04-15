package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269500 <code>a(n) = Fibonacci(10*n)</code>.
 * @author Sean A. Irvine
 */
public class A269500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269500() {
    super(new long[] {-1, 123}, new long[] {0, 55});
  }
}
