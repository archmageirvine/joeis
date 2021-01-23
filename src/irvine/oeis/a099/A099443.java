package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099443 A Chebyshev transform of Fib(n+1).
 * @author Sean A. Irvine
 */
public class A099443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099443() {
    super(new long[] {-1, 1, -1, 1}, new long[] {1, 1, 1, 1});
  }
}
