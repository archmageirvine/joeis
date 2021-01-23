package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a000.A000796;

/**
 * A036974 Positions of the digit '7' in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A036974 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036974() {
    super(new A000796(), 0);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.SEVEN.equals(term);
  }
}

