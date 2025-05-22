package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384126 Consecutive states of a linear congruential pseudo-random number generator (93*s+1) mod 2^13 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384126 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384126() {
    super(93, 1, 8192);
    //System.out.println("Period: " + computePeriod());
  }
}
