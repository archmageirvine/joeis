package irvine.oeis.a055;

import irvine.oeis.a054.A054632;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A055059 Pointers to base-10 digits where primes occur in A055058.
 * @author Sean A. Irvine
 */
public class A055059 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A055059() {
    super(new A054632(), 1);
  }
}
