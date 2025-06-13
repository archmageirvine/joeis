package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384934 Consecutive states of the linear congruential pseudo-random number generator 254*s mod (2^16+1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384934 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384934() {
    super(254, 0, (1L << 16) + 1);
    //System.out.println("Period: " + computePeriod());
  }
}
