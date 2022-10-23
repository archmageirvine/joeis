package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006695 a(2n)=2*a(2n-2)^2-1, a(2n+1)=2a(2n)-1, a(0)=2.
 * @author Sean A. Irvine
 */
public class A006695 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    if (mB == null) {
      mB = Z.THREE;
    } else {
      final Z t = mEven ? mB.multiply2().subtract(1) : mA.square().multiply2().subtract(1);
      mEven = !mEven;
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
