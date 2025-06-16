package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384971 Consecutive internal states of the linear congruential pseudo-random number generator (106*s + 1283) mod 6075 when started at 1.
 * @author Sean A. Irvine
 */
public class A384971 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384971() {
    super(106, 1283, 6075);
    //System.out.println("Period: " + computePeriod());
  }
}
