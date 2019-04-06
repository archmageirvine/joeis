package irvine.oeis.a181;

import irvine.oeis.FiniteSequence;

/**
 * A181449 Numbers n such that 7 is the largest prime factor of n^2 - 1.
 * @author Georg Fischer
 */
public class A181449 extends FiniteSequence {

  /** Construct the sequence. */
  public A181449() {
    super(6, 8, 13, 15, 29, 41, 55, 71, 97, 99, 127, 244, 251, 449, 4801, 8749);
  }
}
