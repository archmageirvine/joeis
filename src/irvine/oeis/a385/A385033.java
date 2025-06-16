package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385033 Consecutive states of the linear congruential pseudo-random number generator 170*s mod 30323 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385033 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385033() {
    super(170, 0, 30323);
    //System.out.println("Period: " + computePeriod());
  }
}
