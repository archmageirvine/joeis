package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384780 Consecutive states of the linear congruential pseudo-random number generator 127107890972165*s mod 2^48 when started at 1.
 * @author Sean A. Irvine
 */
public class A384780 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384780() {
    super(127107890972165L, 0, 1L << 48);
  }
}
