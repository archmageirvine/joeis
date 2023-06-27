package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056327 Number of reversible string structures with n beads using exactly three different colors.
 * @author Sean A. Irvine
 */
public class A056327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056327() {
    super(1, new long[] {36, -66, 6, 49, -24, -6, 6}, new long[] {0, 0, 1, 4, 15, 50, 160});
  }
}
