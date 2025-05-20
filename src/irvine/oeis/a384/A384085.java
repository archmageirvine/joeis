package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384085 Consecutive states of the linear congruential pseudo-random number generator (40*s+725) mod 729 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384085 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384085() {
    super(40, 725, 729);
    //System.out.println("Period: " + computePeriod());
  }
}
