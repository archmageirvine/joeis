package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136038.
 * @author Sean A. Irvine
 */
public class A136038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136038() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 48, 648, 3840, 15000, 45360});
  }
}
