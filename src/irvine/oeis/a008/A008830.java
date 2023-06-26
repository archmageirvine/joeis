package irvine.oeis.a008;

import irvine.oeis.FiniteSequence;

/**
 * A008830 Discrete logarithm of n to the base 2 modulo 11.
 * @author Sean A. Irvine
 */
public class A008830 extends FiniteSequence {

  /** Construct the sequence. */
  public A008830() {
    super(1, FINITE, 0, 1, 8, 2, 4, 9, 7, 3, 6, 5);
  }
}
