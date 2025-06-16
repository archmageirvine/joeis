package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385037 Consecutive states of the linear congruential pseudo-random number generator (936*s + 1399) mod 6655 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385037 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385037() {
    super(936, 1399, 6655);
    //System.out.println("Period: " + computePeriod());
  }
}
