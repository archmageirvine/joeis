package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384432 Consecutive internal states of the linear congruential pseudo-random number generator for Borland C and C++ when started at 1.
 * @author Sean A. Irvine
 */
public class A384432 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384432() {
    super(22695477, 1, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
