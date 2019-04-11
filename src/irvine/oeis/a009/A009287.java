package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A009287 <code>a(1) = 3</code>; thereafter <code>a(n+1) =</code> least k with <code>a(n)</code> divisors.
 * @author Sean A. Irvine
 */
public class A009287 extends A005179 {

  private Z mA = null;
  private long mUsed = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
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
