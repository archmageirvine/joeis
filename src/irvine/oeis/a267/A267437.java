package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267437 A linear recurrence related to the elliptic curves y^2 = x^3 -35*a^2*x - 98*a^3 with a = -1, -5, -6, -17, or -111.
 * @author Sean A. Irvine
 */
public class A267437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267437() {
    super(2, new long[] {-4, 8, -7, 4}, new long[] {11, 23, 67, 151});
  }
}
