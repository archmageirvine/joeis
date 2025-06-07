package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384573 Consecutive states of the linear congruential pseudo-random number generator (314159269*s+1) mod (2^31-1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384573 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384573() {
    super(314159269, 1, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
