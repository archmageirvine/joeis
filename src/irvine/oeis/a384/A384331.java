package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384331 Consecutive internal states of a linear congruential pseudo-random number generator for Microsoft C and C++ when started at 1.
 * @author Sean A. Irvine
 */
public class A384331 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384331() {
    super(214013, 2531011, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
