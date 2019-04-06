package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240910 The sequency numbers of the 32 rows of a Hadamard-Walsh matrix, order 32.
 * @author Georg Fischer
 */
public class A240910 extends FiniteSequence {

  /** Construct the sequence. */
  public A240910() {
    super(0, 31, 15, 16, 7, 24, 8, 23, 3, 28, 12, 19, 4, 27, 11, 20, 1, 30, 14, 17, 6, 25, 9, 22, 2, 29, 13, 18, 5, 26, 10, 21);
  }
}
