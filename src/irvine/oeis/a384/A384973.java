package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384973 Consecutive states of the linear congruential pseudo-random number generator (101*s+1) mod 2^13 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384973 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384973() {
    super(101, 1, 1L << 13);
    //System.out.println("Period: " + computePeriod());
  }
}
