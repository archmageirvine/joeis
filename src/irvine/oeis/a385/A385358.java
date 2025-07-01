package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385358 Consecutive states of the linear congruential pseudo-random number generator (741*s + 66037) mod 312500 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385358 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385358() {
    super(741, 66037, 312500);
  }
}
