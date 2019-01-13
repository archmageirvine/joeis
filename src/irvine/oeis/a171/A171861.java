package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171861.
 * @author Sean A. Irvine
 */
public class A171861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171861() {
    super(new long[] {-1, 0, 1, 1}, new long[] {1, 2, 4, 6});
  }
}
