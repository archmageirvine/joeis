package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384292 Consecutive internal states of the linear congruential pseudo-random number generator (214013*s+13523655) mod 2^24 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384292 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384292() {
    super(214013, 13523655, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
