package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383129 Consecutive internal states of the linear congruential pseudo-random number generator (421*s + 54773) mod 259200 when started at 1.
 * @author Sean A. Irvine
 */
public class A383129 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383129() {
    super(421, 54773, 259200);
    //System.out.println("Period: " + computePeriod());
  }
}
