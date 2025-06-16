package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385039 Consecutive internal states of the linear congruential pseudo-random number generator (171*s + 11213) mod 53125 when started at 1.
 * @author Sean A. Irvine
 */
public class A385039 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385039() {
    super(171, 11213, 53125);
    //System.out.println("Period: " + computePeriod());
  }
}
