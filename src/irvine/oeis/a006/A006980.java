package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006980 Compositions: 6th column of A048004.
 * @author Sean A. Irvine
 */
public class A006980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006980() {
    super(6, new long[] {-1, -2, -3, -4, -5, -4, -2, -1, 0, 1, 2}, new long[] {1, 2, 5, 12, 28, 64, 143, 315, 687, 1485, 3186});
  }
}
