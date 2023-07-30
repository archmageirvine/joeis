package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064820 a(n) = Product_{k=1..4*n-9} prime(k) - prime(4n)^4 where prime(i) = i-th prime.
 * @author Sean A. Irvine
 */
public class A064820 extends A000040 {

  private Z mProd = Z.ONE;
  private final Z[] mBuf = new Z[9];
  {
    mBuf[0] = Z.ONE;
    for (int k = 1; k < mBuf.length; ++k) {
      mBuf[k] = super.next();
    }
    setOffset(3);
  }

  @Override
  public Z next() {
    for (int k = 0; k < 4; ++k) {
      mProd = mProd.multiply(mBuf[k]);
    }
    System.arraycopy(mBuf, 4, mBuf, 0, mBuf.length - 4);
    for (int k = mBuf.length - 4; k < mBuf.length; ++k) {
      mBuf[k] = super.next();
    }
    return mProd.subtract(mBuf[mBuf.length - 1].pow(4));
  }
}
