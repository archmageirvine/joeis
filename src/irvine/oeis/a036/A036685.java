package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a002.A002188;

/**
 * A036685 List of single-heap P-positions in Grundy's game.
 * @author Sean A. Irvine
 */
public class A036685 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036685() {
    super(new A002188(), 0);
  }

  @Override
  public boolean isOk(final Z term) {
    return term.isZero();
  }
}
