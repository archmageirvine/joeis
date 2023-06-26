package irvine.oeis.a231;

import irvine.oeis.FiniteSequence;

/**
 * A231408 Positive integers that are not the sum of distinct odd primes.
 * @author Georg Fischer
 */
public class A231408 extends FiniteSequence {

  /** Construct the sequence. */
  public A231408() {
    super(1, FINITE, 1, 2, 4, 6, 9);
  }
}
