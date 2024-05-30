package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066360 Number of unordered solutions in positive integers of xy + xz + yz = n with gcd(x,y,z) = 1.
 * @author Sean A. Irvine
 */
public class A066360 extends Sequence1 {

  // After T. D. Noe

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x <= Functions.SQRT.l(mN / 3); ++x) {
      for (long y = x; y <= Functions.SQRT.l(x * x + mN) - x; ++y) {
        final long a = mN - x * y;
        final long d = x + y;
        if (a % d == 0) {
          final long z = a / d;
          if (Functions.GCD.l(x, y, z) == 1) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
