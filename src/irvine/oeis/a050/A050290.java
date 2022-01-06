package irvine.oeis.a050;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050290 Zeroless pandigital primes.
 * @author Sean A. Irvine
 */
public class A050290 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050290() {
    super(new A050289() {
      {
        // There is no 9 digit answers, so skip over all 9 digit numbers.
        super.next();
        mA.clear();
      }
    });
  }
}
