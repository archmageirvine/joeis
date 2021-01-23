package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032629 Primes that are concatenations of n with n + 6.
 * @author Sean A. Irvine
 */
public class A032629 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032629() {
    super(new A032611());
  }
}
