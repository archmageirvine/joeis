package irvine.oeis.a271;

import irvine.oeis.FiniteSequence;

/**
 * A271168 Numbers n such that <code>Fibonacci(n)</code> divides <code>p!</code> where p is n-th prime.
 * @author Georg Fischer
 */
public class A271168 extends FiniteSequence {

  /** Construct the sequence. */
  public A271168() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 24, 30, 36);
  }
}
