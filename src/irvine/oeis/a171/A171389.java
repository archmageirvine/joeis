package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171389 <code>a(n) = 21*2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A171389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171389() {
    super(new long[] {-2, 3}, new long[] {20, 41});
  }
}
