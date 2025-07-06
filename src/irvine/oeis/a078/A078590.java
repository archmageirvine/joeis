package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078590 a(1)=1, a(2)=1, a(n)=(2^a(n-1) + 1)/a(n-2).
 * @author Sean A. Irvine
 */
public class A078590 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = Z.TWO.pow(mB).add(1).divide(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

