package irvine.oeis.a141;

import irvine.oeis.FiniteSequence;

/**
 * A141282 Least prime p such that p-6^n, ..., p-6, p, p+6, ... and p+6^n are primes.
 * @author Georg Fischer
 */
public class A141282 extends FiniteSequence {

  /** Construct the sequence. */
  public A141282() {
    super(11, 47, 233, 11459317);
  }
}
