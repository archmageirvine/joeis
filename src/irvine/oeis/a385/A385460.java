package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385460 Consecutive internal states of the linear congruential pseudo-random number generator (1366*s + 150889) mod 714025 when started at 1.
 * @author Sean A. Irvine
 */
public class A385460 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385460() {
    super(1366, 150889, 714025);
  }
}
