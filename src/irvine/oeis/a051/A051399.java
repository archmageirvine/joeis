package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051399 a(n) = (n-1)!*a(n-1)+1.
 * @author Sean A. Irvine
 */
public class A051399 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mN > 2) {
        mF = mF.multiply(mN - 1);
      }
      mA = mA.multiply(mF).add(1);
    }
    return mA;
  }
}
