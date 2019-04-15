package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134498 <code>a(n) = Fibonacci(7n)</code>.
 * @author Sean A. Irvine
 */
public class A134498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134498() {
    super(new long[] {1, 29}, new long[] {0, 13});
  }
}
