package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A037025 a(1) = 8; a(n) = least k with d(k) = a(n-1), where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A037025 extends A005179 {

  private Z mA = null;
  private long mUsed = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.EIGHT;
    } else {
      final long u = mA.longValueExact();
      while (mUsed < u) {
        mA = super.next();
        ++mUsed;
      }
    }
    return mA;
  }
}
