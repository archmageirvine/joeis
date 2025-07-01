package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385337 Consecutive states of the linear congruential pseudo-random number generator (1291*s + 4621) mod 21870 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385337 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385337() {
    super(1291, 4621, 21870);
  }
}
