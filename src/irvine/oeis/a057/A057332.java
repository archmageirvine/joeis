package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a056.A056525;

/**
 * A057332 a(n) is the number of (2n+1)-digit palindromic primes that undulate.
 * @author Sean A. Irvine
 */
public class A057332 extends A056525 {

  private Z mPalin = super.next();
  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    mLimit = mLimit.multiply(100);
    long cnt = 0;
    while (mPalin.compareTo(mLimit) < 0) {
      if (mPalin.isProbablePrime() && ZUtils.isUndulate(mPalin)) {
        ++cnt;
      }
      mPalin = super.next();
    }
    return Z.valueOf(cnt);
  }
}
