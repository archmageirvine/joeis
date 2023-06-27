package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069076 a(n) = (4*n^2 - 1)^3.
 * @author Sean A. Irvine
 */
public class A069076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069076() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {27, 3375, 42875, 250047, 970299, 2924207, 7414875});
  }
}
