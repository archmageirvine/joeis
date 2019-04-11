package irvine.oeis.a193;

import irvine.oeis.FiniteSequence;

/**
 * A193063 Primes p for which there is no prime q <code>== 1 (mod 3)</code> that is smaller than p and is a quadratic residue modulo p.
 * @author Georg Fischer
 */
public class A193063 extends FiniteSequence {

  /** Construct the sequence. */
  public A193063() {
    super(2, 3, 5, 7, 11, 13);
  }
}
