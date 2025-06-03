package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384534 Consecutive states of the linear congruential pseudo-random number generator 1099087573 * s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384534 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384534() {
    super(1099087573, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
