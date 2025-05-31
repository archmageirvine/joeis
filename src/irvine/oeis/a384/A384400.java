package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384400 Consecutive states of the linear congruential pseudo-random number generator 40692*s mod (2^31-249) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384400 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384400() {
    super(40692, 0, (1L << 31) - 249);
    //System.out.println("Period: " + computePeriod());
  }
}
