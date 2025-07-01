package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385336 Consecutive states of the linear congruential pseudo-random number generator (1541*s + 2957) mod 14000 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385336 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385336() {
    super(1541, 2957, 14000);
    //System.out.println("Period: " + computePeriod());
  }
}
