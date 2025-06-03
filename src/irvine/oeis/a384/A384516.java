package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384516 Consecutive states of the linear congruential pseudo-random number generator 410092949*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384516 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384516() {
    super(410092949, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
