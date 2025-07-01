package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385335 Consecutive states of the linear congruential pseudo-random number generator (1741*s + 2731) mod 12960 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385335 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385335() {
    super(1741, 2731, 12960);
    //System.out.println("Period: " + computePeriod());
  }
}
