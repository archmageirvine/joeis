package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384489 Consecutive states of the linear congruential pseudo-random number generator 392314069 * s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384489 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384489() {
    super(392314069, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
