package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384114 Consecutive states of the linear congruential pseudo-random number generator (125*s+1) mod 2^12 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384114 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384114() {
    super(125, 1, 4096);
    //System.out.println("Period: " + computePeriod());
  }
}
