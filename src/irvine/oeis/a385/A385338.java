package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385338 Consecutive states of the linear congruential pseudo-random number generator (421*s + 17117) mod 81000 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385338 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385338() {
    super(421, 17117, 81000);
  }
}
