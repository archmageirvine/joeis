package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048112 a(1) = 1, a(2) = 1, a(3) = 1, a(n) = a(n-3) * (a(n-2) + a(n-1)).
 * @author Sean A. Irvine
 */
public class A048112 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else {
        mC = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mA.multiply(mB.add(mC));
    mA = mB;
    mB = mC;
    mC = t;
    return mC;
  }
}
