package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171516 a(n) = a(n-1) + a(n-2) + k, n&gt;1; with a(0) = 1, a(1) = 2, k = 3.
 * @author Sean A. Irvine
 */
public class A171516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171516() {
    super(new long[] {-1, 0, 2}, new long[] {1, 2, 6});
  }
}
