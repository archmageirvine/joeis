package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137392 (10-n) * Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A137392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137392() {
    super(1, new long[] {-1, -2, 1, 2}, new long[] {9, 8, 14, 18});
  }
}
