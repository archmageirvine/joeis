package irvine.oeis.a392;

import irvine.math.z.Z;

/**
 * A392646 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A392646 extends A392201 {

  @Override
  public Z next() {
    final Z kz = super.next();
    final long k = kz.longValueExact();
    final Z k2 = kz.square();
    long cnt = 0;
    for (long x = 1; x <= k; ++x) {
      for (long y = 1; y <= k; ++y) {
        final Z d = k2.multiply((x - y) * (x - y)).subtract(Z.valueOf(x * x + y * y - k * x * y).multiply(4));
        if (d.signum() >= 0) {
          final Z sd = d.sqrt();
          if (d.auxiliary() == 1) {
            final long t = sd.longValueExact();
            final long u = k * y - k * x;
            final long r1 = u + t;
            if (r1 >= 1 && r1 <= 2 * k) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
