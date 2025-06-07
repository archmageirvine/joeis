package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384615 Consecutive states of the linear congruential pseudo-random number generator for GLIM3 when started at 1.
 * @author Sean A. Irvine
 */
public class A384615 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384615() {
    super(8404997, 1, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
