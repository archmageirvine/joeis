package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384570 Consecutive states of the linear congruential pseudo-random number generator (3141592621*s+1) mod 10^10 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384570 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384570() {
    super(3141592621L, 1, 10000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
