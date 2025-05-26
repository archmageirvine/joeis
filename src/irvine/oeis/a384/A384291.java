package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384291 Consecutive internal states of the linear congruential pseudo-random number generator (214013*s+13737667) mod 2^24 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384291 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384291() {
    super(214013, 13737667, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
