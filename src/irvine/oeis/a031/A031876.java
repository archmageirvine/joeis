package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031876 a(n) = Sum_{k=0..n} floor(k^(1/3)).
 * @author Sean A. Irvine
 */
public class A031876 extends A031424 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;
  private long mM = 2;
  private long mCube = 8;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN > 1) {
      Z t = mB.multiply2().subtract(mA);
      if (mN == mCube) {
        mCube = ++mM * mM * mM;
        t = t.add(1);
      }
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
