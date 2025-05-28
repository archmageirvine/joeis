package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384340 Consecutive states of the linear congruential pseudo-random number generator (314159221*s+211324863) mod 10^9 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384340 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384340() {
    super(314159221, 211324863, 1000000000);
    //System.out.println("Period: " + computePeriod());
  }
}
