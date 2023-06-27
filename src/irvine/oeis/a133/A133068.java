package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133068 Number of surjections from an n-element set to an eight-element set.
 * @author Sean A. Irvine
 */
public class A133068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133068() {
    super(8, new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {40320, 1451520, 30240000, 479001600, 6411968640L, 76592355840L, 843184742400L, 8734434508800L});
  }
}
