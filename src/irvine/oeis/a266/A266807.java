package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266807 Coefficient of x^3 in the minimal polynomial of the continued fraction [1^n,sqrt(6),1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A266807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266807() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {2, -90, -166, -2166, -12010});
  }
}
