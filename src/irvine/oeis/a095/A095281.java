package irvine.oeis.a095;

import irvine.oeis.a001.A001950;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A095281 Upper Wythoff primes, i.e., primes in A001950.
 * @author Georg Fischer
 */
public class A095281 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A095281() {
    super(new A001950());
  }
}
