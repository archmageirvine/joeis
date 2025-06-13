package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384776 Consecutive states of the linear congruential pseudo-random number generator 43272750451645*s mod 2^48 when started at 1.
 * @author Sean A. Irvine
 */
public class A384776 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384776() {
    super(43272750451645L, 0, 1L << 48);
  }
}
