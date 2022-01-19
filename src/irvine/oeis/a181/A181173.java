package irvine.oeis.a181;
// manually

import irvine.oeis.a023.A023721;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A181173 Primes whose base 5 representation does not contain a 0.
 * @author Georg Fischer
 */
public class A181173 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A181173() {
    super(new A023721());
  }
}
