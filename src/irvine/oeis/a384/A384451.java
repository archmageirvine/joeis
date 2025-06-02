package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384451 Consecutive states of the linear congruential pseudo-random number generator randq1 from Numerical Recipes when started at 1.
 * @author Sean A. Irvine
 */
public class A384451 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384451() {
    super(1664525, 1013904223, 1L << 32, 1);
    //System.out.println("Period: " + computePeriod());
  }
}
