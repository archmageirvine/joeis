package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385363 Consecutive states of the linear congruential pseudo-random number generator (3613*s + 45289) mod 214326 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385363 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385363() {
    super(3613, 45289, 214326);
  }
}
