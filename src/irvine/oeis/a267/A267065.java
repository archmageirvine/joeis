package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267065 Coefficient of <code>x^6</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2)+sqrt(3),1,1,...],</code> where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A267065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267065() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {-18, 2498, 7790, 1588998, 47783370, 2692503902L, 118222343438L, 5700687414690L, 265166547527598L});
  }
}
