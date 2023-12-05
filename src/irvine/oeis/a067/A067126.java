package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A067126 Numbers for which phi(n) &gt;= phi(k) for all k = 1 to n-1.
 * @author Sean A. Irvine
 */
public class A067126 extends A000010 {

  private Z mMax = Z.ZERO;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z phi = super.next();
      if (phi.compareTo(mMax) >= 0) {
        mMax = phi;
        return Z.valueOf(mN);
      }
    }
  }
}
