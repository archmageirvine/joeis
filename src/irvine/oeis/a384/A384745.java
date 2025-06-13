package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384745 Consecutive states of the linear congruential pseudo-random number generator (5^17*s+1) mod 2^48 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384745 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384745() {
    super(762939453125L, 1, 1L << 48);
  }
}
