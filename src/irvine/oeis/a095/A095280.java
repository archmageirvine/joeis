package irvine.oeis.a095;

import irvine.oeis.a000.A000201;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A095280 Lower Wythoff primes, i.e., primes in A000201.
 * @author Georg Fischer
 */
public class A095280 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A095280() {
    super(new A000201());
  }
}
