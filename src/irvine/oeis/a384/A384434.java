package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384434 Consecutive states of the linear congruential pseudo-random number generator for CUPL when started at 1.
 * @author Sean A. Irvine
 */
public class A384434 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384434() {
    super(452807053, 0, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
