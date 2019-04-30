package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267066 Coefficient of <code>x^6</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2)+sqrt(3),1,1,...]</code>, where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A267066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267066() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {4, -560, -952, -303372, -8139896, -481544336, -20771606140L, -1008539866512L, -46789454179352L});
  }
}
