package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192579 Primes p for which there is no prime q == 3 (mod 4) that is smaller than p and is a quadratic residue modulo p.
 * @author Georg Fischer
 */
public class A192579 extends FiniteSequence {

  /** Construct the sequence. */
  public A192579() {
    super(2, 3, 5, 7, 17);
  }
}
