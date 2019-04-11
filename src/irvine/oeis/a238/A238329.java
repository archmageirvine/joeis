package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238329 Fibonacci numbers n that have no prime factors of the form <code>4k+1</code>.
 * @author Georg Fischer
 */
public class A238329 extends FiniteSequence {

  /** Construct the sequence. */
  public A238329() {
    super(1, 1, 2, 3, 8, 21, 144, 987, 46368, 2178309, 4807526976L);
  }
}
