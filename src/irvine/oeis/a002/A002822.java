package irvine.oeis.a002;

import irvine.oeis.prime.PrimeConditionListSequence;

/**
 * A002822 Numbers m such that 6m-1, 6m+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A002822 extends PrimeConditionListSequence {

  /** Construct the sequence */
  public A002822() {
    super(1, 6, -1, 6, 1);
  }
}
