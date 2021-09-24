package irvine.oeis.a285;
// manually posins at 2021-09-24 09:16

import irvine.oeis.PositionSequence;

/**
 * A285971 Positions of 0 in A285969; complement of A285970.
 * @author Georg Fischer
 */
public class A285971 extends PositionSequence {

  /** Construct the sequence. */
  public A285971() {
    super(1, new A285969(), 1);
  }
}
