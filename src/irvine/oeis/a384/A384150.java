package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384150 Consecutive states of the linear congruential pseudo-random number generator (10924*s+11830) mod (2^15+1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384150 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384150() {
    super(10924, 11830, 32769);
    //System.out.println("Period: " + computePeriod());
  }
}
