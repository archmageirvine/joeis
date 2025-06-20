package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383162 Consecutive states of the linear congruential pseudo-random number generator (7200*s + 1) mod 23^4 when started at s=1.
 * @author Sean A. Irvine
 */
public class A383162 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383162() {
    super(7200, 1, 279841);
    //System.out.println("Period: " + computePeriod());
  }
}
