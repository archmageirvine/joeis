package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160050 Numerator of the Harary number for the star graph s_n.
 * @author Sean A. Irvine
 */
public class A160050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160050() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 1, 5, 9, 7, 10, 27, 35, 22});
  }
}
