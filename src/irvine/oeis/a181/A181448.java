package irvine.oeis.a181;

import irvine.oeis.FiniteSequence;

/**
 * A181448 Numbers n such that 5 is the largest prime factor of n^2 - 1.
 * @author Georg Fischer
 */
public class A181448 extends FiniteSequence {

  /** Construct the sequence. */
  public A181448() {
    super(4, 9, 11, 19, 26, 31, 49, 161);
  }
}
