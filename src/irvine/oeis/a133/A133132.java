package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133132 Number of surjections from an n-element set to a ten-element set.
 * @author Sean A. Irvine
 */
public class A133132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133132() {
    super(new long[] {-3628800, 10628640, -12753576, 8409500, -3416930, 902055, -157773, 18150, -1320, 55}, new long[] {3628800, 199584000, 6187104000L, 142702560000L, 2731586457600L, 45950224320000L, 703098107712000L, 10009442963520000L, 134672620008326400L, 1732015476199008000L});
  }
}
