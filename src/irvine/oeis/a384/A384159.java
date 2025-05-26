package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384159 Consecutive states of the linear congruential pseudo-random number generator for 32-bit WATFOR/WATFIV when started at 1.
 * @author Sean A. Irvine
 */
public class A384159 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384159() {
    super(20613, 0, 2147483648L);
    //System.out.println("Period: " + computePeriod());
  }
}
