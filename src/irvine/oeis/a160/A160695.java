package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160695 Integers m such that 3*m+1 and 7*m+1 are both perfect squares.
 * @author Sean A. Irvine
 */
public class A160695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160695() {
    super(1, new long[] {1, -24, 24}, new long[] {0, 5, 120});
  }
}
