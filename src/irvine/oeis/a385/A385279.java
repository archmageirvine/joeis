package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385279 Consecutive states of the linear congruential pseudo-random number generator (625*s + 6571) mod 31104 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385279 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385279() {
    super(625, 6571, 31104);
    //System.out.println("Period: " + computePeriod());
  }
}
