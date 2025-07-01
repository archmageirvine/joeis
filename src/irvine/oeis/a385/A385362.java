package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385362 Consecutive states of the linear congruential pseudo-random number generator (2041*s + 25673) mod 121500 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385362 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385362() {
    super(2041, 25673, 121500);
  }
}
