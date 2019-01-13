package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171663.
 * @author Sean A. Irvine
 */
public class A171663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171663() {
    super(new long[] {8, -8, -6, 6, 1}, new long[] {1, 5, 5, 13, 25});
  }
}
