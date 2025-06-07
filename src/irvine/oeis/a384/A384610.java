package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384610 Consecutive states of the linear congruential pseudo-random number generator (262145*s+3) mod 2^35 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384610 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384610() {
    super(262145, 3, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
