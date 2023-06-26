package irvine.oeis.a271;

import irvine.oeis.FiniteSequence;

/**
 * A271317 Fibonacci(n) divides the n-th primorial.
 * @author Georg Fischer
 */
public class A271317 extends FiniteSequence {

  /** Construct the sequence. */
  public A271317() {
    super(1, FINITE, 1, 2, 3, 4, 5, 7, 8, 9, 10, 14, 16, 20);
  }
}
