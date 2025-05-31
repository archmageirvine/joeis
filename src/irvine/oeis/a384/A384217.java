package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384217 Consecutive states of the linear congruential pseudo-random number generator (843314861*s+453816693) mod 2^31 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384217 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384217() {
    super(843314861, 453816693, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
