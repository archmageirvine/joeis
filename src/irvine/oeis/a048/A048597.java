package irvine.oeis.a048;

import irvine.oeis.FiniteSequence;

/**
 * A048597 Very round numbers: reduced residue system consists of only primes and 1.
 * @author Georg Fischer
 */
public class A048597 extends FiniteSequence {

  /** Construct the sequence. */
  public A048597() {
    super(1, 2, 3, 4, 6, 8, 12, 18, 24, 30);
  }
}
