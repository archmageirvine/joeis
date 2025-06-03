package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384551 Consecutive states of the linear congruential pseudo-random number generator 3203713013*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384551 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384551() {
    super(3203713013L, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
