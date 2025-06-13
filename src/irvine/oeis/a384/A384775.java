package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384775 Consecutive states of the linear congruential pseudo-random number generator 33952834046453*s mod 2^48 when started at 1.
 * @author Sean A. Irvine
 */
public class A384775 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384775() {
    super(33952834046453L, 0, 1L << 48);
  }
}
