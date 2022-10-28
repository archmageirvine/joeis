package irvine.oeis.a285;
// manually posins at 2021-08-27 09:06

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a286.A286939;

/**
 * A285432 Positions of 0 in A286939; complement of A285564.
 * @author Georg Fischer
 */
public class A285432 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A285432() {
    super(1, new A286939(), 0);
  }
}
