package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384550 Consecutive states of the linear congruential pseudo-random number generator 2824527309*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384550 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384550() {
    super(2824527309L, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
