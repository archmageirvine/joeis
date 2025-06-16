package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385032 Consecutive states of the linear congruential pseudo-random number generator 172*s mod 30307 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385032 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385032() {
    super(172, 0, 30307);
    //System.out.println("Period: " + computePeriod());
  }
}
