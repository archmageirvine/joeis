package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385031 Consecutive states of the linear congruential pseudo-random number generator 171*s mod 30269 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385031 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385031() {
    super(171, 0, 30269);
    //System.out.println("Period: " + computePeriod());
  }
}
