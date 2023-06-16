package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;

/**
 * A036268 7th differences of primes.
 * @author Sean A. Irvine
 */
public class A036268 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036268() {
    super(1, new A036267());
  }
}

