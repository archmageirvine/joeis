package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074590 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long x = 0, t; (t = mN - x * x) >= 0; ++x) {
      final long mx = x == 0 ? 1 : 2;
      for (long y = 0, s; (s = t - y * y) >= 0; ++y) {
        final long my = y == 0 ? 1 : 2;
        final long z = Functions.SQRT.l(s);
        if (z * z == s && Functions.GCD.l(x, y, z) <= 1) {
          final long mz = z == 0 ? 1 : 2;
          count += mx * my * mz;
        }
      }
    }
    return Z.valueOf(count);
  }
}
