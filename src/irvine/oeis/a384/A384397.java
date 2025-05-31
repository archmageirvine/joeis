package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384397 Consecutive states of the linear congruential pseudo-random number generator 45742*s mod (2^31-909) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384397 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384397() {
    super(45742, 0, (1L << 31) - 909);
    //System.out.println("Period: " + computePeriod());
  }
}
