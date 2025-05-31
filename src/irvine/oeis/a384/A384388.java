package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384388 Consecutive internal states of the linear congruential pseudo-random number generator (5^11*s+293183133) mod 2^30 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384388 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384388() {
    super(48828125, 293183133, 1L << 30);
    //System.out.println("Period: " + computePeriod());
  }
}
