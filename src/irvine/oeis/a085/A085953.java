package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085953 a(1) = 2, a(n+1) = the smallest multiple of prime(n+1) beginning with a(n).
 * @author Sean A. Irvine
 */
public class A085953 extends A000040 {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    final Z p = super.next();
    if (mA.mod(p).isZero()) {
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
      if (u.mod(p).isZero()) {
        mA = u;
        return u;
      }
    }
  }
}
