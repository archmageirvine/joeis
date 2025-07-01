package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385340 Consecutive states of the linear congruential pseudo-random number generator (1093*s + 18257) mod 86436 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385340 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385340() {
    super(1093, 18257, 86436);
  }
}
