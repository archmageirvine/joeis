package irvine.oeis.a279;

import irvine.oeis.FiniteSequence;

/**
 * A279687 a(0) = 1, a(n) is the least prime factor of a(n-1)^2+1 that has not previously appeared in the sequence for n &gt; 0.
 * @author Georg Fischer
 */
public class A279687 extends FiniteSequence {

  /** Construct the sequence. */
  public A279687() {
    super(1, 2, 5, 13, 17, 29, 421, 401, 37, 1877, 41);
  }
}
