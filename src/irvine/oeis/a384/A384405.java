package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384405 Consecutive internal states of the linear congruential pseudo-random number generator 69621 * s mod (2^31-1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384405 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384405() {
    super(69621, 0, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
