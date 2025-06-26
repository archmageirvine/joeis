package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385127 Consecutive internal states of the linear congruential pseudo-random number generator for gcc 2.6.3 when started at 1.
 * @author Sean A. Irvine
 */
public class A385127 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385127() {
    super(69069, 5, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
