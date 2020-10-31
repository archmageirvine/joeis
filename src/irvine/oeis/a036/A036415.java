package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A036415.
 * @author Sean A. Irvine
 */
public class A036415 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036415() {
    super(new A036414(), 1);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ZERO.equals(term);
  }
}
