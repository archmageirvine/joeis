package irvine.oeis.a008;

import irvine.oeis.FiniteSequence;

/**
 * A008907 Number of legal <code>tic-tac-toe</code> (or noughts and crosses) positions after n plays, up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A008907 extends FiniteSequence {

  /** Construct the sequence. */
  public A008907() {
    super(1, 3, 12, 38, 108, 174, 204, 153, 57, 15);
  }
}
