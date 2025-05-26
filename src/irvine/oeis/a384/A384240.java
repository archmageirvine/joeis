package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384240 Consecutive states of the linear congruential pseudo-random number generator (2897*s + 1) mod 2^23 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384240 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384240() {
    super(2897, 1, 1L << 23);
    //System.out.println("Period: " + computePeriod());
  }
}
