package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384339 Consecutive states of the linear congruential pseudo-random number generator for Berkeley Pascal 3.1 when started at 1.
 * @author Sean A. Irvine
 */
public class A384339 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384339() {
    super(62605, 113218009, 1L << 29);
    //System.out.println("Period: " + computePeriod());
  }
}
