package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384290 Consecutive internal states of the linear congruential pseudo-random number generator (214013*s+10395331) mod 2^24 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384290 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384290() {
    super(214013, 10395331, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
