package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;

/**
 * A036266 5th differences of primes.
 * @author Sean A. Irvine
 */
public class A036266 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036266() {
    super(1, new A036265());
  }
}

