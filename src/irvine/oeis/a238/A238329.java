package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238329 Fibonacci numbers that have no prime factors of the form 4k+1.
 * @author Georg Fischer
 */
public class A238329 extends FiniteSequence {

  /** Construct the sequence. */
  public A238329() {
    super(1, FINITE, 1, 1, 2, 3, 8, 21, 144, 987, 46368, 2178309, 4807526976L);
  }
}
