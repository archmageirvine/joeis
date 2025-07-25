package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383126 Consecutive internal states of the linear congruential pseudo-random number generator (281*s + 28411) mod 134456 when started at 1.
 * @author Sean A. Irvine
 */
public class A383126 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383126() {
    super(281, 28411, 134456);
    //System.out.println("Period: " + computePeriod());
  }
}
