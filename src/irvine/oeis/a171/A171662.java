package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171662.
 * @author Sean A. Irvine
 */
public class A171662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171662() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 9, 13, 17});
  }
}
