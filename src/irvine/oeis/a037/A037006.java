package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a000.A000796;

/**
 * A037006 Positions of the digit '8' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037006 extends PositionSubsequence {

  /** Construct the sequence. */
  public A037006() {
    super(new A000796(), 0);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.EIGHT.equals(term);
  }
}

