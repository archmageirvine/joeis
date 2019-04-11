package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267062 Coefficient of <code>x^3</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2)+sqrt(3),1,1,</code>...], where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A267062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267062() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {212, -5760, -165852, -10501476, -449827456, -21948311748L, -1016699956620L, -48023357086272L, -2251419462422716L});
  }
}
