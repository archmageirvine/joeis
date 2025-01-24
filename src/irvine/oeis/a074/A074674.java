package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074674 Differences between successive four-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074674 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074674() {
    super(1, new A074673());
  }
}
