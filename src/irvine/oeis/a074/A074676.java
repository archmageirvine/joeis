package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074676 Differences between consecutive three-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074676 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074676() {
    super(1, new A074675());
  }
}
