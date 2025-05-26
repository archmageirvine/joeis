package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384260 Consecutive internal states of the linear congruential pseudo-random number generator 3373*s mod (2^24-3) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384260 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384260() {
    super(3373, 0, (1L << 24) - 3);
    //System.out.println("Period: " + computePeriod());
  }
}
