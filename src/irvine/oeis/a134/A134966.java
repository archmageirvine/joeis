package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134966 Primes that use all of the prime digits 2,3,5,7 exactly once.
 * @author Georg Fischer
 */
public class A134966 extends FiniteSequence {

  /** Construct the sequence. */
  public A134966() {
    super(1, FINITE, 2357, 2753, 3257, 3527, 5237, 5273, 7253, 7523);
  }
}
