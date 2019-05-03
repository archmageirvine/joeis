package irvine.oeis.a141;

import irvine.oeis.FiniteSequence;

/**
 * A141282 Least prime p such that <code>p-6^n</code>, ..., <code>p-6</code>, p, <code>p+6</code>, ... and <code>p+6^n</code> are primes.
 * @author Georg Fischer
 */
public class A141282 extends FiniteSequence {

  /** Construct the sequence. */
  public A141282() {
    super(11, 47, 233, 11459317);
  }
}
