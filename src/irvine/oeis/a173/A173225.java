package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173225 a(n) is the smallest nonnegative m such that average digit of m^2 is n.
 * @author Georg Fischer
 */
public class A173225 extends FiniteSequence {

  /** Construct the sequence. */
  public A173225() {
    super(0, 1, 145, 12, 2, 8, 24, 1667, 313, 3);
  }
}
