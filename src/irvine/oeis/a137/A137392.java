package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137392 <code>(10-n) *</code> Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A137392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137392() {
    super(new long[] {-1, -2, 1, 2}, new long[] {9, 8, 14, 18});
  }
}
