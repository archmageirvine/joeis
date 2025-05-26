package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940 Consecutive states of the linear congruential pseudo-random number generator (25173*s+13849) mod 2^16 when started at s=1.
 * @author Sean A. Irvine
 */
public class A383940 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383940() {
    super(25173, 13849, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
