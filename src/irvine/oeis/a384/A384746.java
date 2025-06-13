package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384746 Consecutive states of the linear congruential pseudo-random number generator MCNP from Los Alamos when started at 1.
 * @author Sean A. Irvine
 */
public class A384746 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384746() {
    super(19073486328125L, 0, 1L << 48);
  }
}
