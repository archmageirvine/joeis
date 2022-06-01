package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100047 A Chebyshev transform of the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A100047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100047() {
    super(new long[] {-1, 1, -1, 1}, new long[] {0, 1, 1, -1});
  }
}
