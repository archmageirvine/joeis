package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384404 Consecutive internal states of the linear congruential pseudo-random number generator 48271 * s mod (2^31-1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384404 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384404() {
    super(134775813, 1, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
