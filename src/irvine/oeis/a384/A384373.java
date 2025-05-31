package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384373 Consecutive internal states of the linear congruential pseudo-random number generator 131075*s mod 2^27 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384373 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384373() {
    super(131075, 0, 1L << 27);
    //System.out.println("Period: " + computePeriod());
  }
}
