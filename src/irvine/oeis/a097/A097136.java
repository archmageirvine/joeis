package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097136 <code>a(n) = 3*Fibonacci(2*n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A097136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097136() {
    super(new long[] {1, -4, 4}, new long[] {1, 4, 10});
  }
}
