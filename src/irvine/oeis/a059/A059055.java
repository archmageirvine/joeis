package irvine.oeis.a059;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A059055 Primes which can be written as (b^k+1)/(b+1) for positive integers b and k.
 * @author Sean A. Irvine
 */
public class A059055 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A059055() {
    super(new A059054());
  }
}
