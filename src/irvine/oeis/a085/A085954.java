package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A085954 a(1) = 4, a(n+1) = the smallest multiple of composite(n+1) beginning with a(n).
 * @author Sean A. Irvine
 */
public class A085954 extends A002808 {

  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    final Z c = super.next();
    if (mA.mod(c).isZero()) {
      return mA;
    }
    Z t = mA;
    long lim = 1;
    long k = -1;
    while (true) {
      if (++k >= lim) {
        lim *= 10;
        k = 0;
        t = t.multiply(10);
      }
      final Z u = t.add(k);
      if (u.mod(c).isZero()) {
        mA = u;
        return u;
      }
    }
  }
}
