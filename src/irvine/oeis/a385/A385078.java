package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385078 Consecutive states of the linear congruential pseudo-random number generator (967*s + 3041) mod 14406 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385078 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385078() {
    super(967, 3041, 14406);
    //System.out.println("Period: " + computePeriod());
  }
}
