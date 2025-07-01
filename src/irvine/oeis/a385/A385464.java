package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385464 Consecutive internal states of the linear congruential pseudo-random number generator (9301*s + 49297) mod 233280 when started at 1.
 * @author Sean A. Irvine
 */
public class A385464 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385464() {
    super(9301, 49297, 233280);
  }
}
