package irvine.oeis.a050;

import irvine.oeis.prime.PrimePositionSubsequence;
import irvine.oeis.a051.A051953;

/**
 * A050530 Numbers k such that k - phi(k) is prime.
 * @author Sean A. Irvine
 */
public class A050530 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A050530() {
    super(new A051953(), 1);
  }
}
