package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a008.A008904;

/**
 * A045547 Numbers whose factorial has '2' as its final nonzero digit.
 * @author Sean A. Irvine
 */
public class A045547 extends PositionSubsequence {

  /** Construct the sequence. */
  public A045547() {
    super(0, new A008904());
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.TWO.equals(term);
  }
}
