package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165802 Primes p with f(p), f(f(p)), ... all prime, where f(n) = (n-1)/2. Stop when f(...f(p)...) is less than 4.
 * @author Georg Fischer
 */
public class A165802 extends FiniteSequence {

  /** Construct the sequence. */
  public A165802() {
    super(2, 3, 5, 7, 11, 23, 47);
  }
}
