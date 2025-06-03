package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384535 Consecutive states of the linear congruential pseudo-random number generator 1566083941*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384535 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384535() {
    super(1566083941, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
