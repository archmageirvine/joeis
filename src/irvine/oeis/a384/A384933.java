package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384933 Consecutive states of the linear congruential pseudo-random number generator (1589013525*s + 1) mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384933 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384933() {
    super(1589013525, 1, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
