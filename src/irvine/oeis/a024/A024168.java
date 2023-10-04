package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024168 a(n) = n! * (1 + Sum_{j=1..n} (-1)^j/j).
 * @author Sean A. Irvine
 */
public class A024168 extends Sequence0 {

  private long mN = 0;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = mA.multiply(++mN).multiply(mN).add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
