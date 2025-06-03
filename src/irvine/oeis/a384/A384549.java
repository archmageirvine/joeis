package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384549 Consecutive states of the linear congruential pseudo-random number generator 2396548189*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384549 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384549() {
    super(2396548189L, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
