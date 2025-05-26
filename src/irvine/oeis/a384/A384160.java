package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384160 Consecutive states of the linear congruential pseudo-random number generator for 36-bit WATFOR/WATFIV when started at 1.
 * @author Sean A. Irvine
 */
public class A384160 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384160() {
    super(131069, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
