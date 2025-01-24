package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074672 Differences between successive five-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074672 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074672() {
    super(1, new A074671());
  }
}
