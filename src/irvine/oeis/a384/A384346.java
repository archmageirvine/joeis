package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384346 Consecutive internal states of the linear congruential pseudo-random number generator (4253261*s+12896793) mod 2^24 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384346 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384346() {
    super(4253261, 12896793, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
