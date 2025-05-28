package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384341 Consecutive states of the linear congruential pseudo-random number generator (31481*s+21139) mod 10^5 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384341 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384341() {
    super(31481, 21139, 100000);
    //System.out.println("Period: " + computePeriod());
  }
}
