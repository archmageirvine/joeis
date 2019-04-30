package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099444 A Chebyshev transform of <code>Fib(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A099444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099444() {
    super(new long[] {-1, 3, -3, 3}, new long[] {1, 3, 7, 15});
  }
}
