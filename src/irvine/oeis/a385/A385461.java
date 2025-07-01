package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385461 Consecutive internal states of the linear congruential pseudo-random number generator (8121*s + 28411) mod 134456 when started at 1.
 * @author Sean A. Irvine
 */
public class A385461 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385461() {
    super(8121, 28411, 134456);
    //System.out.println("Period: " + computePeriod());
  }
}
