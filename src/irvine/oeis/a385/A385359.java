package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385359 Consecutive states of the linear congruential pseudo-random number generator (1597*s + 51749) mod 244944 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385359 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385359() {
    super(1597, 51749, 244944);
  }
}
