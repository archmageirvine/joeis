package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010100 a(n) = a(n-1)*a(n-2) with a(0)=1, a(1)=10.
 * @author Sean A. Irvine
 */
public class A010100 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TEN;
    } else {
      final Z t = mA.multiply(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

