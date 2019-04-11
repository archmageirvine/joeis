package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267437 A linear recurrence related to the elliptic curves y^2 <code>= x^3 -35*a^2*x - 98*a^3</code> with <code>a = -1, -5, -6, -17,</code> or <code>-111</code>.
 * @author Sean A. Irvine
 */
public class A267437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267437() {
    super(new long[] {-4, 8, -7, 4}, new long[] {11, 23, 67, 151});
  }
}
