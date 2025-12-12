package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082549 Numbers k such that concatenation of first k primes, separated by zeros, is prime.
 * @author Sean A. Irvine
 */
public class A082549 extends A000040 {

  private Z mConcat = Z.ZERO;
  private Z mLim = Z.TEN;
  private Z mMul = Z.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (p.compareTo(mLim) >= 0) {
        mLim = mMul;
        mMul = mMul.multiply(10);
      }
      mConcat = mConcat.multiply(mMul).add(p);
      if (mConcat.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
