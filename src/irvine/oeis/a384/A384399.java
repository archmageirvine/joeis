package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384399 Consecutive states of the linear congruential pseudo-random number generator 41546*s mod (2^31-837) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384399 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384399() {
    super(41546, 0, (1L << 31) - 837);
    //System.out.println("Period: " + computePeriod());
  }
}
