package irvine.oeis.a158;

import irvine.oeis.FiniteSequence;

/**
 * A158641 Strong primes p: adding 2 to any one digit of p produces a prime number (no digits 8 &amp; 9 in p)
 * @author Georg Fischer
 */
public class A158641 extends FiniteSequence {

  /** Construct the sequence. */
  public A158641() {
    super(3, 5, 11, 17, 41, 107, 137, 347, 2111, 2657, 3527, 4421, 6761, 21011, 24371, 32057);
  }
}
