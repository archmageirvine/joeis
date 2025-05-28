package irvine.oeis.a382;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A382535 Consecutive states of Lehmer's original linear congruential pseudo-random number generator 23*s mod (10^8+1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A382535 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A382535() {
    super(23, 0, 100000001);
    //System.out.println("Period: " + computePeriod());
  }
}
