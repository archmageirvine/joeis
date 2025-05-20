package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384082 Consecutive states of the linear congruential pseudo-random number generator (61*s+323) mod 500 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384082 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384082() {
    super(61, 323, 500);
    //System.out.println("Period: " + computePeriod());
  }
}
