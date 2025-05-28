package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384316 Consecutive states of the linear congruential pseudo-random number generator 3125*s mod 2^26 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384316 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384316() {
    super(3125, 0, 1L << 26);
    //System.out.println("Period: " + computePeriod());
  }
}
