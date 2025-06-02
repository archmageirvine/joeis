package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384448 Consecutive states of the linear congruential pseudo-random number generator for the INMOS Transputer when started at 1.
 * @author Sean A. Irvine
 */
public class A384448 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384448() {
    super(1664525, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
