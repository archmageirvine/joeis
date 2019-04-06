package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240909 The sequency numbers of the 16 rows of a Hadamard-Walsh matrix of order 16.
 * @author Georg Fischer
 */
public class A240909 extends FiniteSequence {

  /** Construct the sequence. */
  public A240909() {
    super(0, 15, 7, 8, 3, 12, 4, 11, 1, 14, 6, 9, 2, 13, 5, 10);
  }
}
