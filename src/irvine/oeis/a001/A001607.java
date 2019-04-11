package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001607 <code>a(n) = -a(n-1) - 2*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A001607 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = mB.add(mA.multiply2()).negate();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
