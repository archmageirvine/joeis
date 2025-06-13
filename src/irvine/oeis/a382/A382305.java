package irvine.oeis.a382;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A382305 Consecutive internal states of the linear congruential pseudo-random number rand48 for Unix when started at 1.
 * @author Sean A. Irvine
 */
public class A382305 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A382305() {
    super(25214903917L, 11, 1L << 48);
  }
}
