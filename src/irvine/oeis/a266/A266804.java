package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266804 Coefficient of <code>x^0</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(6),1,1,</code>...], where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A266804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266804() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {19, 19, 361, 1795, 14011});
  }
}
