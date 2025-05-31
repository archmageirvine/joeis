package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384387 Consecutive states of the linear congruential pseudo-random number generator (13493037709*s+7261067085) mod 2^35 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384387 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384387() {
    super(13493037709L, 7261067085L, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
