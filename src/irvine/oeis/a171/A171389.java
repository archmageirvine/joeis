package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171389 a(n) = 21*2^n - 1.
 * @author Sean A. Irvine
 */
public class A171389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171389() {
    super(new long[] {-2, 3}, new long[] {20, 41});
  }
}
