package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385038 Consecutive internal states of the linear congruential pseudo-random number generator (1366*s + 1283) mod 6075 when started at 1.
 * @author Sean A. Irvine
 */
public class A385038 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385038() {
    super(1366, 1283, 6075);
    //System.out.println("Period: " + computePeriod());
  }
}
