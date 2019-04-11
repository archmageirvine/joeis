package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192578 Primes p for which there is no prime q <code>== 1 (mod 4)</code> that is smaller than p and is a quadratic residue modulo p.
 * @author Georg Fischer
 */
public class A192578 extends FiniteSequence {

  /** Construct the sequence. */
  public A192578() {
    super(2, 3, 5, 7, 13, 37);
  }
}
