package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384567 Consecutive states of the linear congruential pseudo-random number generator for the Atari ST when started at 1.
 * @author Sean A. Irvine
 */
public class A384567 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384567() {
    super(3141592621L, 1, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
