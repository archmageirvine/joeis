package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006139 n*a(n) = 2*(2*n-1)*a(n-1) + 4*(n-1)*a(n-2) with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A006139 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(4 * mN - 2).add(mA.multiply(4 * mN - 4)).divide(mN);
      mA = mB;
      mB = t;
    } else if (mN == 0) {
      return mA;
    }
    return mB;
  }
}
