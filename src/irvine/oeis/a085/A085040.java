package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085040 Squares arising in A085039. n-th partial sum of A085039.
 * @author Sean A. Irvine
 */
public class A085040 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    Z r = mSum.sqrt();
    while (true) {
      r = r.add(1);
      final Z r2 = r.square();
      final Z d = r2.subtract(mSum);
      if (d.mod(p).isZero()) {
        mSum = r2;
        return mSum;
      }
    }
  }
}
