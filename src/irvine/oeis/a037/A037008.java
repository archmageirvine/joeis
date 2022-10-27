package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a000.A000796;

/**
 * A037008 Positions of the digit '0' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037008 extends PositionSubsequence {

  /** Construct the sequence. */
  public A037008() {
    super(0, new A000796());
  }

  @Override
  public boolean isOk(final Z term) {
    return term.isZero();
  }
}

