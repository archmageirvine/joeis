package irvine.oeis.a055;

import irvine.oeis.a054.A054636;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A055063 Positions of primes in A054636 with offset 1.
 * @author Sean A. Irvine
 */
public class A055063 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A055063() {
    super(new A054636(), 1);
  }
}
