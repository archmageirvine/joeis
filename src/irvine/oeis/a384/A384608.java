package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384608 Consecutive states of the linear congruential pseudo-random number generator (129*s+27098671125) mod 2^35 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384608 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384608() {
    super(129, 27098671125L, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
