package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384315 Consecutive internal states of the linear congruential pseudo-random number generator for Demos started at 1.
 * @author Sean A. Irvine
 */
public class A384315 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384315() {
    super(1L << 13, 0, (1L << 26) - 9317);
    //System.out.println("Period: " + computePeriod());
  }
}
