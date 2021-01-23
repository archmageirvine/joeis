package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092414 Negative of the determinant of the 3 X 3 matrix with entries (X+Y)^n.
 * @author Sean A. Irvine
 */
public class A092414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092414() {
    super(new long[] {497664000, -45607680, 1667088, -30380, 276}, new long[] {0, 0, 8, 2016, 301856});
  }
}
