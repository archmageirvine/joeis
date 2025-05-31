package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384398 Consecutive states of the linear congruential pseudo-random number generator 42024*s mod (2^31-847) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384398 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384398() {
    super(42024, 0, (1L << 31) - 847);
    //System.out.println("Period: " + computePeriod());
  }
}
