package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290313 Fourth diagonal sequence of the Sheffer triangle A094816 (special Charlier).
 * @author Sean A. Irvine
 */
public class A290313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290313() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 24, 145, 545, 1575, 3836, 8274});
  }
}
