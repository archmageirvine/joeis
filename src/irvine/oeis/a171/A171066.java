package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171066.
 * @author Sean A. Irvine
 */
public class A171066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171066() {
    super(new long[] {-1, 1, 9, 1}, new long[] {0, 1, 1, 9});
  }
}
