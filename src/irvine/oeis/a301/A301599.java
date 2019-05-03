package irvine.oeis.a301;

import irvine.oeis.FiniteSequence;

/**
 * A301599 Numbers k at which the ratio <code>r(k) = (k-th</code> prime) <code>/</code> (average of first k primes) reaches a record high.
 * @author Georg Fischer
 */
public class A301599 extends FiniteSequence {

  /** Construct the sequence. */
  public A301599() {
    super(1, 2, 3, 4, 5, 7, 9, 10, 12, 17, 25, 31, 35, 48);
  }
}
