package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a001.A001223;

/**
 * A036263 Second differences of primes.
 * @author Sean A. Irvine
 */
public class A036263 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036263() {
    super(new A001223());
  }
}

