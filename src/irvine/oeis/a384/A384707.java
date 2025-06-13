package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384707 Consecutive states of the linear congruential pseudo-random number generator 71971110957370*s mod (2^47-115) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384707 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384707() {
    super(71971110957370L, 0, (1L << 47) - 115);
    //System.out.println("Period: " + computePeriod());
  }
}
