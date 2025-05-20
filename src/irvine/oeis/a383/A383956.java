package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383956 Consecutive states of the linear congruential pseudo-random number generator used by BASIC on the Poly-1 computer when started at 1.
 * @author Sean A. Irvine
 */
public class A383956 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383956() {
    super(4253261, 3518565, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
