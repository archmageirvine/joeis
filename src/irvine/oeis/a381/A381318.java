package irvine.oeis.a381;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A381318 Consecutive internal states of the linear congruential pseudo-random number generator (5^11*s+36643009) mod 2^30 when started at s=1.
 * @author Sean A. Irvine
 */
public class A381318 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A381318() {
    super(48828125, 36643009, 1L << 30);
    //System.out.println("Period: " + computePeriod());
  }
}
