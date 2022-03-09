package irvine.oeis.a055;

import irvine.oeis.a054.A054637;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A055073 Pointers to base-3 digits where primes occur in A055072.
 * @author Sean A. Irvine
 */
public class A055073 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A055073() {
    super(new A054637(), 1);
  }
}
