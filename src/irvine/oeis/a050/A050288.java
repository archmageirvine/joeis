package irvine.oeis.a050;

import irvine.oeis.a171.A171102;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050288 Pandigital primes.
 * @author Sean A. Irvine
 */
public class A050288 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050288() {
    super(new A171102() {
      {
        // There is no 10 digit pandigital prime, the following quickly steps
        // over all 10 digit pandigital numbers.
        super.next();
        mA.clear();
      }
    });
  }
}
