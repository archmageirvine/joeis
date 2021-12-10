package irvine.oeis.a167;

import irvine.oeis.FiniteSequence;

/**
 * A167417 Largest prime concatenation of the first n primes, or 0 if no such prime exists.
 * @author Georg Fischer
 */
public class A167417 extends FiniteSequence {

  /** Construct the sequence. */
  public A167417() {
    super(2, 23, 523, 7523, 751123, 71151323, 7115117323L, 711913152317L, 71231915117323L);
  }
}
