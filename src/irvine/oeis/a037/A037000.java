package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a000.A000796;

/**
 * A037000 Positions of the digit '1' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037000 extends PositionSubsequence {

  /** Construct the sequence. */
  public A037000() {
    super(0, new A000796());
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ONE.equals(term);
  }
}

