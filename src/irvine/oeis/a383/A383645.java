package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383645 Consecutive internal states of the linear congruential pseudo-random number generator (17405*s+10395331) mod 2^24 when started at s=1.
 * @author Sean A. Irvine
 */
public class A383645 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383645() {
    super(17405, 10395331, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
