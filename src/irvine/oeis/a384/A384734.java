package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384734 Consecutive states of the linear congruential pseudo-random number generator (513*s+29741096258473) mod 2^47 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384734 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384734() {
    super(513, 29741096258473L, 1L << 47);
  }
}
