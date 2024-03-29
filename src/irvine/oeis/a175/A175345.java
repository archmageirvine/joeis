package irvine.oeis.a175;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006218;

/**
 * A175345 Numbers m such that A006218(m) is a perfect square.
 * @author Georg Fischer
 */
public class A175345 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A175345() {
    super(1, 0, new A006218(), SQUARE);
    super.next();
  }
}
