package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385361 Consecutive states of the linear congruential pseudo-random number generator (2661*s + 36979) mod 175000 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385361 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385361() {
    super(2661, 36979, 175000);
  }
}
