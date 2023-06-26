package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228642 Squares of primes mod 100.
 * @author Georg Fischer
 */
public class A228642 extends FiniteSequence {

  /** Construct the sequence. */
  public A228642() {
    super(1, FINITE, 1, 4, 9, 21, 25, 29, 41, 49, 61, 69, 81, 89);
  }
}
