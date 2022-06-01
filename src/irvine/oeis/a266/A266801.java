package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266801 Coefficient of x^2 in the minimal polynomial of the continued fraction [1^n,sqrt(3),1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A266801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266801() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-7, 23, 65, 653, 3935});
  }
}
