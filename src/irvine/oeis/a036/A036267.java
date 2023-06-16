package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;

/**
 * A036267 6th differences of primes.
 * @author Sean A. Irvine
 */
public class A036267 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036267() {
    super(1, new A036266());
  }
}

