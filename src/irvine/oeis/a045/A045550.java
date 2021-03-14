package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a008.A008904;

/**
 * A045550 Numbers n such that final nonzero digit of n! is '8'.
 * @author Sean A. Irvine
 */
public class A045550 extends PositionSubsequence {

  /** Construct the sequence. */
  public A045550() {
    super(new A008904(), 0);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.EIGHT.equals(term);
  }
}
