package irvine.oeis.a297;

import irvine.oeis.FiniteSequence;

/**
 * A297960 <code>a(1) =</code> number of 1-digit primes (that is, 4: 2,3,5,7); then <code>a(n) =</code> number of distinct n-digit prime numbers obtained by alternately right- and left-concatenating a digit to the <code>a(n-1)</code> primes obtained in the previous iteration.
 * @author Georg Fischer
 */
public class A297960 extends FiniteSequence {

  /** Construct the sequence. */
  public A297960() {
    super(4, 9, 30, 49, 99, 74, 101, 71, 72, 35, 28, 9, 4);
  }
}
