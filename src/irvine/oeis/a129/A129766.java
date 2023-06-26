package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129766 Triangular array read by rows, made up of traditional exceptional groups plus A1: as A1,G2,F4,E6,E7,E8 as m(i) exponents as in A005556, A005763, A005776.
 * @author Georg Fischer
 */
public class A129766 extends FiniteSequence {

  /** Construct the sequence. */
  public A129766() {
    super(1, FINITE, 1, 1, 5, 1, 5, 7, 11, 1, 4, 5, 7, 8, 11, 1, 5, 7, 9, 11, 13, 17, 1, 7, 11, 13, 17, 19, 23, 29);
  }
}
