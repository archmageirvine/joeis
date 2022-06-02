package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A057333 Numbers of n-digit primes that undulate.
 * @author Sean A. Irvine
 */
public class A057333 extends A000040 {

  private Z mP = super.next();
  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    mLimit = mLimit.multiply(10);
    long cnt = 0;
    while (mP.compareTo(mLimit) < 0) {
      if (ZUtils.isUndulate(mP)) {
        ++cnt;
      }
      mP = super.next();
    }
    return Z.valueOf(cnt);
  }
}
