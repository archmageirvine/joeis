package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071953 Diagonal T(n,n-2) of triangle in A071951.
 * @author Sean A. Irvine
 */
public class A071953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071953() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4, 52, 292, 1092, 3192, 7896, 17304});
  }
}
