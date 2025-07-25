package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384572 Consecutive states of the linear congruential pseudo-random number generator (4219755981*s+1) mod 10^10 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384572 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384572() {
    super(4219755981L, 1, 10000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
