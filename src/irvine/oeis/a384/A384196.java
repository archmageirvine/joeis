package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384196 Consecutive states of the linear congruential pseudo-random number generator 20403*s mod 2^15 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384196 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384196() {
    super(20403, 0, 1L << 15);
    //System.out.println("Period: " + computePeriod());
  }
}
