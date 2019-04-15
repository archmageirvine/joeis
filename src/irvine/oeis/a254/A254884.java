package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254884 <code>a(n) = Fibonacci(2*n) + ((-1)^n-1)*Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A254884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254884() {
    super(new long[] {-1, 3, 2, -9, 2, 3}, new long[] {0, -1, 3, 4, 21, 45});
  }
}
