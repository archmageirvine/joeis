package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385365 Consecutive states of the linear congruential pseudo-random number generator (3661*s + 30809) mod 145800 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385365 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385365() {
    super(3661, 30809, 145800);
  }
}
