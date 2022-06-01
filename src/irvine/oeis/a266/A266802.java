package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266802 Coefficient of x^3 in the minimal polynomial of the continued fraction [1^n,sqrt(3),1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A266802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266802() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {2, -12, -16, -294, -1552});
  }
}
