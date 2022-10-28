package irvine.oeis.a285;
// manually posins at 2021-08-27 09:06

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a286.A286939;

/**
 * A285564 Positions of 1 in A286939; complement of A285432.
 * @author Georg Fischer
 */
public class A285564 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A285564() {
    super(1, new A286939(), 1);
  }
}
