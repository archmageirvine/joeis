package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384547 Consecutive states of the linear congruential pseudo-random number generator 1749966429*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384547 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384547() {
    super(1749966429, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
