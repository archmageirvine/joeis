package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384401 Consecutive states of the linear congruential pseudo-random number generator 40014*s mod (2^31-85) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384401 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384401() {
    super(40014, 0, (1L << 31) - 85);
    //System.out.println("Period: " + computePeriod());
  }
}
