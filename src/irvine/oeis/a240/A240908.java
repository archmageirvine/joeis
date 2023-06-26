package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240908 The sequency numbers of the 8 rows of a version of the Hadamard-Walsh matrix of order 8.
 * @author Georg Fischer
 */
public class A240908 extends FiniteSequence {

  /** Construct the sequence. */
  public A240908() {
    super(1, FINITE, 0, 7, 3, 4, 1, 6, 2, 5);
  }
}
