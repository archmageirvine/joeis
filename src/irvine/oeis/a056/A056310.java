package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056310 Number of reversible strings with n beads using exactly three different colors.
 * @author Sean A. Irvine
 */
public class A056310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056310() {
    super(1, new long[] {36, -66, 6, 49, -24, -6, 6}, new long[] {0, 0, 3, 18, 78, 273, 921});
  }
}
