package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171638 Denominator of 1/(n-2)^2 - 1/(n+2)^2.
 * @author Sean A. Irvine
 */
public class A171638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171638() {
    super(new long[] {1, 0, -5, 0, 10, 0, -10, 0, 5, 0}, new long[] {0, 25, 9, 441, 64, 2025, 225, 5929, 576, 13689});
  }
}
