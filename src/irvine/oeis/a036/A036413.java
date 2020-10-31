package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A036413.
 * @author Sean A. Irvine
 */
public class A036413 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036413() {
    super(new A036412(), 1);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ZERO.equals(term);
  }
}
