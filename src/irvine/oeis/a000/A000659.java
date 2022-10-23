package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000659 a(n) = 2^a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A000659 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ZERO;
    } else if (mA == null) {
      mA = Z.ZERO;
    } else {
      if (mB.bitLength() > 30) {
        throw new UnsupportedOperationException();
      }
      final Z t = Z.ONE.shiftLeft(mB.intValue()).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
