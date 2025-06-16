package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384431 Consecutive states of the linear congruential pseudo-random number generator (430*s + 2531) mod 11979 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384431 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384431() {
    super(430, 2531, 11979);
    //System.out.println("Period: " + computePeriod());
  }
}
