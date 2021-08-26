package irvine.oeis.a008;

import irvine.oeis.FiniteSequence;

/**
 * A008831 Discrete logarithm of n to the base 2 modulo 13.
 * @author Sean A. Irvine
 */
public class A008831 extends FiniteSequence {

  /** Construct the sequence. */
  public A008831() {
    super(0, 1, 4, 2, 9, 5, 11, 3, 8, 10, 7, 6);
  }
}
