package irvine.oeis.a223;

import irvine.oeis.FiniteSequence;

/**
 * A223081 Numbers n with distinct digits such that n divides the reversal of n.
 * @author Georg Fischer
 */
public class A223081 extends FiniteSequence {

  /** Construct the sequence. */
  public A223081() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1089, 2178, 21978);
  }
}
