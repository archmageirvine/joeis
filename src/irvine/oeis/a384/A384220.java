package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384220 Consecutive states of the linear congruential pseudo-random number generator for Smalltalk-80 when started at 1.
 * @author Sean A. Irvine
 */
public class A384220 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384220() {
    super(27181, 13849, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
