package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385341 Consecutive states of the linear congruential pseudo-random number generator (1021*s + 25673) mod 121500 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385341 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385341() {
    super(1021, 25673, 121500);
  }
}
