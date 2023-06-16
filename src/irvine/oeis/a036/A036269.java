package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;

/**
 * A036269 8th differences of primes.
 * @author Sean A. Irvine
 */
public class A036269 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036269() {
    super(1, new A036268());
  }
}

