package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074668 Differences between successive 7-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074668 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074668() {
    super(1, new A074667());
  }
}
