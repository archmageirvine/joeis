package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000976.
 * @author Sean A. Irvine
 */
public class A000976 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mPrev = null;
  private Z mPrevAns = null;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mN < 3) {
      return Z.ZERO;
    }
    // Remove powers of 2
    Z modulus = mF.makeOdd();
    // Remove powers of 5
    while (modulus.mod(5) == 0) {
      modulus = modulus.divide(5);
    }
    if (modulus.equals(mPrev)) {
      return mPrevAns;
    }
    // Perhaps there is a fast way of doing 10^k == 1 (mod m) ?
    long k = 0;
    Z v = Z.ONE;
    while (true) {
      ++k;
      v = v.modMultiply(10, modulus);
      if (Z.ONE.equals(v)) {
        final Z a = Z.valueOf(k);
        mPrev = modulus;
        mPrevAns = a;
        return Z.valueOf(k);
      }
    }
  }
}
