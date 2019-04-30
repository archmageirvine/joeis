package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001882 <code>a(2n) = a(2n-1) + 2a(2n-2), a(2n+1) = a(2n) + a(2n-1)</code>, with <code>a(1) = 2</code> and <code>a(2) = 3</code>.
 * @author Sean A. Irvine
 */
public class A001882 implements Sequence {

  private boolean mSign = false;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    if (mB == null) {
      mB = Z.THREE;
    } else {
      mSign = !mSign;
      final Z t = mB.add(mSign ? mA : mA.multiply2());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
