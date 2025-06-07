package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384637 Consecutive states of the linear congruential pseudo-random number generator 5^13*s mod 2^35 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384637 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384637() {
    super(1220703125, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
