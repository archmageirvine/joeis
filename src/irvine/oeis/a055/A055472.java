package irvine.oeis.a055;
// manually deris at 2021-10-28 22:51

import irvine.oeis.a152.A152948;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A055472 Primes of the form k(k+1)/2+2 (i.e., two more than a triangular number).
 *
 * @author Georg Fischer
 */
public class A055472 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A055472() {
    super(new A152948());
    next();
  }
}
