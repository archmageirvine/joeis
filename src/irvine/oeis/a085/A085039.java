package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085039 Smallest multiple of the n-th prime such that every partial sum is a square.
 * @author Sean A. Irvine
 */
public class A085039 extends A000040 {

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
        return d;
      }
    }
  }
}
