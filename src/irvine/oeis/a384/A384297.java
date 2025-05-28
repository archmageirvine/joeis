package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384297 Consecutive internal states of the linear congruential pseudo-random number generator for Microsoft QBASIC when started at 1.
 * @author Sean A. Irvine
 */
public class A384297 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384297() {
    super(16598013, 12820163, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
