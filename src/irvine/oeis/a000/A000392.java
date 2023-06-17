package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000392 Stirling numbers of second kind S(n,3).
 * @author Sean A. Irvine
 */
public class A000392 extends AbstractSequence {

  /** Construct the sequence. */
  public A000392() {
    super(0);
  }

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(3).add(Z.ONE.shiftLeft(mN - 2)).subtract(1);
    }
    return mA;
  }
}

