package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097512 a(n) = 6*Lucas(2n) - Fibonacci(2n+2).
 * @author Sean A. Irvine
 */
public class A097512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097512() {
    super(new long[] {-1, 3}, new long[] {11, 15});
  }
}
