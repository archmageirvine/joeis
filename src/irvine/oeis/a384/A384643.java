package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384643 Consecutive states of the linear congruential pseudo-random number generator for Simula on the UNIVAC when started at 1.
 * @author Sean A. Irvine
 */
public class A384643 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384643() {
    super(30517578125L, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
