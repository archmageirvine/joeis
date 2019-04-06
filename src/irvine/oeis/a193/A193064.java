package irvine.oeis.a193;

import irvine.oeis.FiniteSequence;

/**
 * A193064 Primes p for which there is no prime q == 2 (mod 3) that is smaller than p and is a quadratic residue modulo p.
 * @author Georg Fischer
 */
public class A193064 extends FiniteSequence {

  /** Construct the sequence. */
  public A193064() {
    super(2, 3, 5, 13);
  }
}
