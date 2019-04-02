package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001054 a(n) = a(n-1)*a(n-2) - 1.
 * @author Sean A. Irvine
 */
public class A001054 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA.multiply(mB).subtract(1);
    mA = mB;
    mB = t;
    return t;
  }
}
