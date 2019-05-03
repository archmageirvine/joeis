package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192224 <code>P-integers: n</code> such that the first <code>phi(n)</code> primes coprime to n form a reduced residue system modulo n, where phi is Euler's totient function <code>A000010</code>.
 * @author Georg Fischer
 */
public class A192224 extends FiniteSequence {

  /** Construct the sequence. */
  public A192224() {
    super(2, 4, 6, 12, 18, 30);
  }
}
