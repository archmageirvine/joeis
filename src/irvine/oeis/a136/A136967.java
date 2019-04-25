package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136967 Numbers n such that n and the square of n use only the digits 1, 2, 3 and 4.
 * @author Georg Fischer
 */
public class A136967 extends FiniteSequence {

  /** Construct the sequence. */
  public A136967() {
    super(1, 2, 11, 12, 21, 111, 1111);
  }
}
