package irvine.oeis.a075;

import irvine.oeis.prime.PrimeConditionListSequence;

/**
 * A075749 Numbers k such that 210*k +- 1 are twin primes.
 * @author Sean A. Irvine
 */
public class A075749 extends PrimeConditionListSequence {

  /** Construct the sequence */
  public A075749() {
    super(1, 210, -1, 210, 1);
  }
}
