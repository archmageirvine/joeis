package irvine.oeis.a075;

import irvine.oeis.prime.PrimeConditionListSequence;

/**
 * A075750 210*n -/+ 11 are primes.
 * @author Sean A. Irvine
 */
public class A075750 extends PrimeConditionListSequence {

  /** Construct the sequence */
  public A075750() {
    super(1, 210, -11, 210, 11);
  }
}
