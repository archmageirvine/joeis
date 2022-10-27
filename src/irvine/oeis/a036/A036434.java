package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A036434 Integers which cannot be written as k+tau(k) for some k.
 * @author Sean A. Irvine
 */
public class A036434 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036434() {
    super(1, new A036431());
  }

  @Override
  public boolean isOk(final Z term) {
    return term.isZero();
  }
}
