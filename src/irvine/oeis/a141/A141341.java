package irvine.oeis.a141;

import irvine.oeis.FiniteSequence;

/**
 * A141341 Totally Goldbach numbers: Positive integers n such that for all primes p &lt; n-1 with p not dividing n, n-p is prime.
 * @author Georg Fischer
 */
public class A141341 extends FiniteSequence {

  /** Construct the sequence. */
  public A141341() {
    super(1, 2, 3, 4, 5, 6, 8, 10, 12, 18, 24, 30);
  }
}
