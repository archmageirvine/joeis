package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385463 Consecutive internal states of the linear congruential pseudo-random number generator (7141*s + 54773) mod 259200 when started at 1.
 * @author Sean A. Irvine
 */
public class A385463 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385463() {
    super(7141, 54773, 259200);
    //System.out.println("Period: " + computePeriod());
  }
}
