package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143010 Crystal ball sequence for the A4 x A4 lattice.
 * @author Sean A. Irvine
 */
public class A143010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143010() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 41, 661, 5741, 33001, 142001, 494341, 1465661, 3833941});
  }
}
