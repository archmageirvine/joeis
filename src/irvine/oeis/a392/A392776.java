package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a331.A331605;

/**
 * A392776 a(n) is the number of solutions of (x^2+y^2+z^2)/(x*y + x*z + y*z) = A331605(n), such that 0 &lt; |x| &lt;= |y| &lt;= z &lt;= A331605(n), gcd(|x|,|y|,z) = 1.
 * @author Sean A. Irvine
 */
public class A392776 extends A331605 {

  @Override
  public Z next() {
    final Z kz = super.next();
    final long k = kz.longValueExact();
    long cnt = 0;
    for (long x = -k; x <= k; ++x) {
      if (x == 0) {
        continue;
      }
      final long ax = Math.abs(x);
      for (long y = -k; y <= k; ++y) {
        final long ay = Math.abs(y);
        if (ay < ax) {
          continue;
        }
        //final Z d = Z.valueOf((k + 2) * (k * y * y + k * x * x + 2 * k * x * y - 2 * y * y - 2 * x * x));
        final Z d = kz.add(2).multiply(kz.multiply(y * y).add(kz.multiply(x * x)).add(kz.multiply(2 * x * y)).subtract(2 * y * y + 2 * x * x));
        if (d.signum() >= 0) {
          final Z sd = d.sqrt();
          if (d.auxiliary() == 1) {
            final long t = sd.longValueExact();
            final long u = k * (x + y);
            final long z1 = u + t;
            if ((z1 & 1) == 0) {
              final long z = z1 / 2;
              if (ay <= z && z <= k && Functions.GCD.l(ax, ay, z) == 1) {
                ++cnt;
              }
            }
            if (t != 0) {
              final long z2 = u - t;
              if ((z2 & 1) == 0) {
                final long z = z2 / 2;
                if (ay <= z && z <= k && Functions.GCD.l(ax, ay, z) == 1) {
                  ++cnt;
                }
              }
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
