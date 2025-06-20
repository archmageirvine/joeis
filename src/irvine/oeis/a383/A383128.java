package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383128 Consecutive internal states of the linear congruential pseudo-random number generator (321*s + 123) mod 10^5 when started at 1.
 * @author Sean A. Irvine
 */
public class A383128 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383128() {
    super(321, 123, 100000);
    //System.out.println("Period: " + computePeriod());
  }
}
