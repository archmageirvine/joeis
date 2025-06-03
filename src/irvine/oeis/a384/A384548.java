package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384548 Consecutive states of the linear congruential pseudo-random number generator 2304580733*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384548 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384548() {
    super(2304580733L, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
