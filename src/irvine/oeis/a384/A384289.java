package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384289 Consecutive internal states of the linear congruential pseudo-random number generator for GWBASIC 3.23 when started at 1.
 * @author Sean A. Irvine
 */
public class A384289 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384289() {
    super(214013, 2531011, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
