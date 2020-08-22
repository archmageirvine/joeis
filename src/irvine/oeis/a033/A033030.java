package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033030 Derangement numbers d(n,3) where d(n,k) = k(n-1)(d(n-1,k) + d(n-2,k)), with d(0,k) = 1 and d(1,k) = 0.
 * @author Sean A. Irvine
 */
public class A033030 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mA.add(mB).multiply(mN - 1).multiply(3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
