package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384779 Consecutive states of the linear congruential pseudo-random number generator 68909602460261*s mod 2^48 when started at 1.
 * @author Sean A. Irvine
 */
public class A384779 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384779() {
    super(68909602460261L, 0, 1L << 48);
  }
}
