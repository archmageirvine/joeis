package irvine.oeis.a297;

import irvine.oeis.FiniteSequence;

/**
 * A297960 a(1) = number of 1-digit primes (that is, 4: 2,3,5,7); then a(n) = number of distinct n-digit prime numbers obtained by alternately right- and left-concatenating a digit to the a(n-1) primes obtained in the previous iteration.
 * @author Georg Fischer
 */
public class A297960 extends FiniteSequence {

  /** Construct the sequence. */
  public A297960() {
    super(4, 9, 30, 49, 99, 74, 101, 71, 72, 35, 28, 9, 4);
  }
}
