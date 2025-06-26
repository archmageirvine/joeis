package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385102 Consecutive internal states of the linear congruential pseudo-random number generator for Turbo Pascal 3.0 when started at 1.
 * @author Sean A. Irvine
 */
public class A385102 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385102() {
    super(129, 907633385, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
