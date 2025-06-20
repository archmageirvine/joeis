package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385080 Consecutive states of the linear congruential pseudo-random number generator 237*s mod (2^16+1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A385080 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385080() {
    super(237, 0, 65537);
    //System.out.println("Period: " + computePeriod());
  }
}
