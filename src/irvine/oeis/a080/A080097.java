package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080097 <code>a(n) =</code> Fibonacci(n+2)^2 <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A080097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080097() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 3, 8, 24});
  }
}
