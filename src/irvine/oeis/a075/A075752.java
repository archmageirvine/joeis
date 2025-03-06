package irvine.oeis.a075;

import irvine.oeis.prime.PrimeConditionListSequence;

/**
 * A075752 210*n -/+ 17 ares both primes.
 * @author Sean A. Irvine
 */
public class A075752 extends PrimeConditionListSequence {

  /** Construct the sequence */
  public A075752() {
    super(1, 210, -17, 210, 17);
  }
}
