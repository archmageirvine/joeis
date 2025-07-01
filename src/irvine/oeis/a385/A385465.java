package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385465 Consecutive internal states of the linear congruential pseudo-random number generator (4096*s + 150889) mod 714025 when started at 1.
 * @author Sean A. Irvine
 */
public class A385465 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385465() {
    super(4096, 150889, 714025);
  }
}
