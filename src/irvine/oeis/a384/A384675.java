package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384675 Consecutive states of the linear congruential pseudo-random number generator 7^13*s mod 10^11 when started at 1.
 * @author Sean A. Irvine
 */
public class A384675 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384675() {
    super(96889010407L, 0, 100000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
