package irvine.oeis.a317;

import irvine.oeis.FiniteSequence;

/**
 * A317401 Number of distinct (up to rotation and reflection) tic-tac-toe positions with n tokens which allow a winning strategy for X.
 * @author Georg Fischer
 */
public class A317401 extends FiniteSequence {

  /** Construct the sequence. */
  public A317401() {
    super(0, 0, 7, 9, 85, 67, 139, 70, 23, 12);
  }
}
