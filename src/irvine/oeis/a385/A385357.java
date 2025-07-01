package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385357 Consecutive states of the linear congruential pseudo-random number generator (1277*s + 24749) mod 117128 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385357 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385357() {
    super(1277, 24749, 117128);
  }
}
