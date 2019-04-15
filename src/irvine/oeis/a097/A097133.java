package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097133 <code>3*Fibonacci(n)+(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A097133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097133() {
    super(new long[] {1, 2, 0}, new long[] {1, 2, 4});
  }
}
