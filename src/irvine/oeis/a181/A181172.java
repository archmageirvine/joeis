package irvine.oeis.a181;
// manually

import irvine.oeis.a023.A023705;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A181172 Primes whose base 4 representation does not contain a 0.
 * @author Georg Fischer
 */
public class A181172 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A181172() {
    super(new A023705());
  }
}
