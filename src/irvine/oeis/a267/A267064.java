package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267064 Coefficient of x^5 in the minimal polynomial of the continued fraction [1^n,sqrt(2)+sqrt(3),1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A267064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267064() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {-68, -5760, -35252, -4744764, -160222784, -8602304988L, -384492157220L, -18412926914112L, -858719581400084L});
  }
}
