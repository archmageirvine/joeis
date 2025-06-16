package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384961 Consecutive states of the linear congruential pseudo-random number generator (257*s + 41) mod 2^16 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384961 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384961() {
    super(257, 41, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
