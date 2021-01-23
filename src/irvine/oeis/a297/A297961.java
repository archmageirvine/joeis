package irvine.oeis.a297;

import irvine.oeis.FiniteSequence;

/**
 * A297961 a(1) = number of 1-digit primes (that is, 4: 2,3,5,7); then a(n) = number of distinct n-digit prime numbers obtained by alternately left- and right-concatenating a digit to the a(n-1) primes obtained in the previous iteration.
 * @author Georg Fischer
 */
public class A297961 extends FiniteSequence {

  /** Construct the sequence. */
  public A297961() {
    super(4, 11, 20, 53, 51, 100, 63, 76, 42, 43, 20, 13, 4, 4, 1);
  }
}
