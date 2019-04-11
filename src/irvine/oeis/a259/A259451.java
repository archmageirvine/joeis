package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259451 <code>a(n) =</code> n^2*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A259451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259451() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 1, 4, 18, 48, 125});
  }
}
