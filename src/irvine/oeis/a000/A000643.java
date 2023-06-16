package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000643 a(n) = a(n-1) + 2^a(n-2).
 * @author Sean A. Irvine
 */
public class A000643 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ZERO;
    } else if (mA == null) {
      mA = Z.ZERO;
    } else {
      if (mA.bitLength() > 30) {
        throw new UnsupportedOperationException();
      }
      final Z t = mB.add(Z.ONE.shiftLeft(mA.longValue()));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
