package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017535.
 * @author Sean A. Irvine
 */
public class A017535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017535() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2197, 15625, 50653});
  }
}
