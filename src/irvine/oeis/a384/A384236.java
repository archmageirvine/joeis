package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384236 Consecutive states of the linear congruential pseudo-random number generator (9806*s+1) mod (2^17-1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384236 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384236() {
    super(9806, 1, (1L << 17) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
