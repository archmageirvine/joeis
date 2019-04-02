package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056312 Number of reversible strings with n beads using exactly five different colors.
 * @author Sean A. Irvine
 */
public class A056312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056312() {
    super(new long[] {-7200, 12840, 2160, -14918, 4706, 5595, -3195, -575, 695, -75, -45, 13}, new long[] {0, 0, 0, 0, 60, 900, 8400, 63000, 417120, 2551560, 14804700, 82764900});
  }
}
