package irvine.oeis.a055;

import irvine.oeis.a054.A054633;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A055074 Pointers to base-2 digits where primes occur in A054633.
 * @author Sean A. Irvine
 */
public class A055074 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A055074() {
    super(new A054633(), 1);
  }
}
