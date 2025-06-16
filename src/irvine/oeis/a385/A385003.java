package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385003 Consecutive states of the linear congruential pseudo-random number generator (421*s + 1663) mod 7875 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385003 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385003() {
    super(421, 1663, 7875);
    //System.out.println("Period: " + computePeriod());
  }
}
