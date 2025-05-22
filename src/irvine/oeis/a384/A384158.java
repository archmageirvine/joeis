package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384158 Consecutive states of the linear congruential pseudo-random number generator for 16-bit WATFOR/WATFIV when started at 1.
 * @author Sean A. Irvine
 */
public class A384158 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384158() {
    super(253, 0, 32768);
    //System.out.println("Period: " + computePeriod());
  }
}
