package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384778 Consecutive states of the linear congruential pseudo-random number generator 55151000561141*s mod 2^48 when started at 1.
 * @author Sean A. Irvine
 */
public class A384778 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384778() {
    super(55151000561141L, 0, 1L << 48);
  }
}
