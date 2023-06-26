package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069700 Triangular numbers with internal digits 9.
 * @author Georg Fischer
 */
public class A069700 extends FiniteSequence {

  /** Construct the sequence. */
  public A069700() {
    super(1, FINITE, 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 190, 496, 595, 990, 5995);
  }
}
