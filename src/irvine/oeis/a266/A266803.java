package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266803 Coefficient of x^0 in the minimal polynomial of the continued fraction [1^n,sqrt(2)+sqrt(3),1,1,...], where 1^n means n ones.
 * @author Sean A. Irvine
 */
public class A266803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266803() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {49, 49, 25281, 606409, 37676521, 1596669889, 78061422609L, 3612062087761L, 170677159358209L});
  }
}
