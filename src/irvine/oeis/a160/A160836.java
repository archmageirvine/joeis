package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160836.
 * @author Sean A. Irvine
 */
public class A160836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160836() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 69, 1027, 6825, 29073, 93789, 250363});
  }
}
