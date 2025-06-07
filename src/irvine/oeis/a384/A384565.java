package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384565 Consecutive states of the linear congruential pseudo-random number generator 5*s mod 2^35 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384565 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384565() {
    super(5, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
