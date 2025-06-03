package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384532 Consecutive states of the linear congruential pseudo-random number generator 663608941*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384532 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384532() {
    super(663608941, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
