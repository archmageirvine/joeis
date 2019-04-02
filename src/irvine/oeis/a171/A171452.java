package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171452 a(n) = C(n,2) + floor(n/3).
 * @author Sean A. Irvine
 */
public class A171452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171452() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 0, 1, 4, 7});
  }
}
