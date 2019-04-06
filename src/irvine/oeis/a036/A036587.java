package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036587 Number of binary rooted trees with n nodes and height at most 4.
 * @author Georg Fischer
 */
public class A036587 extends FiniteSequence {

  /** Construct the sequence. */
  public A036587() {
    super(1, 1, 1, 2, 3, 5, 6, 8, 8, 9, 7, 7, 4, 3, 1, 1);
  }
}
