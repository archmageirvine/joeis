package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385036 Consecutive states of the linear congruential pseudo-random number generator (419*s + 6173) mod 29282 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385339 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385339() {
    super(1255, 6173, 29282);
    //System.out.println("Period: " + computePeriod());
  }
}
